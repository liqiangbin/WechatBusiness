/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.cn.hnust.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cn.hnust.dao.BusinessMapper;
import com.cn.hnust.pojo.Business;
import com.cn.hnust.pojo.BusinessExample;
import com.cn.hnust.service.IbusinessService;
import com.cn.hnust.utils.PageBean;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

/**
 * 代理商Service
 * @author ccl
 * @version 2016-09-16
 */
@Service
@Transactional(readOnly = true)
public class BusinessService implements IbusinessService {

	@Resource
	private BusinessMapper businessMapper;

	@Override
	public int save(Business entity) {
		// TODO Auto-generated method stub
		return businessMapper.insert(entity);
	}

	@Override
	public int edit(Business entity) {
		// TODO Auto-generated method stub
		return businessMapper.updateByPrimaryKeySelective(entity);
	}



	@Override
	public int deleteById(int id) {
		// TODO Auto-generated method stub
		return businessMapper.deleteByPrimaryKey(id);
	}

	@Override
	public PageBean list(int currentPage, int pageSize) {
		PageBean pageBean = new PageBean();
		BusinessExample example=new BusinessExample();
		PageHelper.startPage(currentPage, pageSize);
		List<Business> list = businessMapper.selectByExample(example);
		PageInfo<Business> info = new PageInfo<Business>(list);
		long total = info.getTotal();
		int totalPage=(int) ((total+ pageSize  - 1)/pageSize);
		pageBean.setTotalPage(totalPage);
		pageBean.setTotal(total);
		pageBean.setRows(list);
		pageBean.setCurrentPage(currentPage);
		return pageBean;
	}

	@Override
	public Business get(int id) {
		// TODO Auto-generated method stub
		return businessMapper.selectByPrimaryKey(id);
	}

	@Override
	public List<Business> selectAll() {
		BusinessExample example=new BusinessExample();
		return businessMapper.selectByExample(example);
	}
	
	
}