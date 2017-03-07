/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.cn.hnust.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cn.hnust.dao.OrderMapper;
import com.cn.hnust.dao.Package_Mapper;
import com.cn.hnust.pojo.Order;
import com.cn.hnust.pojo.OrderExample;
import com.cn.hnust.pojo.Package_;
import com.cn.hnust.pojo.Package_Example;
import com.cn.hnust.service.IPackage_Service;
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
public class Package_Service implements IPackage_Service{

	@Resource
	private Package_Mapper pagkage_Mapper;
	
	@Override
	public int save(Package_ entity) {
		// TODO Auto-generated method stub
		return pagkage_Mapper.insert(entity);
	}

	@Override
	public int edit(Package_ entity) {
		// TODO Auto-generated method stub
		return pagkage_Mapper.updateByPrimaryKey(entity);
	}

	@Override
	public Package_ get(int id) {
		// TODO Auto-generated method stub
		return pagkage_Mapper.selectByPrimaryKey(id);
	}

	@Override
	public PageBean list(int currentPage, int pageSize) {
		PageBean pageBean = new PageBean();
		Package_Example example=new Package_Example();
		PageHelper.startPage(currentPage, pageSize);
		List<Package_> list = pagkage_Mapper.selectByExample(example);
		PageInfo<Package_> info = new PageInfo<Package_>(list);
		long total = info.getTotal();
		int totalPage=(int) ((total+ pageSize  - 1)/pageSize);
		pageBean.setTotalPage(totalPage);
		pageBean.setTotal(total);
		pageBean.setRows(list);
		pageBean.setCurrentPage(currentPage);
		return pageBean;
	}

	@Override
	public int delete(Package_ entity) {
		Package_Example example=new Package_Example();
		// TODO Auto-generated method stub
		return pagkage_Mapper.deleteByExample(example);
	}

	@Override
	public int deleteById(int id) {
		// TODO Auto-generated method stub
		return pagkage_Mapper.deleteByPrimaryKey(id);
	}

	@Override
	public List<Package_> selectAll() {
		Package_Example example=new Package_Example();
		return pagkage_Mapper.selectByExample(example);
	}

}