/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.cn.hnust.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cn.hnust.dao.AgentMapper;
import com.cn.hnust.dao.LeaderMapper;
import com.cn.hnust.pojo.Agent;
import com.cn.hnust.pojo.AgentExample;
import com.cn.hnust.pojo.Leader;
import com.cn.hnust.pojo.LeaderExample;
import com.cn.hnust.service.ILeaderService;
import com.cn.hnust.utils.PageBean;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

/**
 * 领导Service
 * 
 * @author ccl
 * @version 2016-09-16
 */
@Service
@Transactional(readOnly = true)
public class LeaderService implements ILeaderService {
	@Resource
	private LeaderMapper leaderMapper;

	@Override
	public int save(Leader entity) {
		// TODO Auto-generated method stub
		return leaderMapper.insert(entity);
	}

	@Override
	public int edit(Leader entity) {
		// TODO Auto-generated method stub
		return leaderMapper.updateByPrimaryKey(entity);
	}

	@Override
	public Leader get(int id) {
		// TODO Auto-generated method stub
		return leaderMapper.selectByPrimaryKey(id);
	}

	public PageBean list(int currentPage,int pageSize) {
		
		PageBean pageBean=new PageBean();
		LeaderExample example = new LeaderExample();
		PageHelper.startPage(currentPage, pageSize);
		List<Leader> list = leaderMapper.selectByExample(example);
		PageInfo<Leader> info=new PageInfo<Leader>(list);
		long total = info.getTotal();
		int totalPage=(int) ((total+ pageSize  - 1)/pageSize);
		pageBean.setTotalPage(totalPage);
		pageBean.setTotal(total);
		pageBean.setRows(list);
		pageBean.setCurrentPage(currentPage);
		return pageBean;
	}

	@Override
	public int delete(Leader entity) {
		LeaderExample example = new LeaderExample();
		// TODO Auto-generated method stub
		return leaderMapper.deleteByExample(example);
	}

	@Override
	public int deleteById(int id) {
		// TODO Auto-generated method stub
		return leaderMapper.deleteByPrimaryKey(id);
	}

	@Override
	public List<Leader> getList() {
		LeaderExample example = new LeaderExample();
		return leaderMapper.selectByExample(example);
	}

}