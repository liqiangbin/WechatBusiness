/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.cn.hnust.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cn.hnust.dao.AgentMapper;
import com.cn.hnust.pojo.Agent;
import com.cn.hnust.pojo.AgentExample;
import com.cn.hnust.pojo.AgentExample.Criteria;
import com.cn.hnust.service.IAgentService;
import com.cn.hnust.utils.PageBean;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

/**
 * 代理商Service
 * 
 * @author ccl
 * @version 2016-09-16
 */
@Service
@Transactional(readOnly = true)
public class AgentService implements IAgentService {

	@Resource
	private AgentMapper agentMapper;

	@Override
	public int save(Agent entity) {
		return agentMapper.insert(entity);
	}

	@Override
	public int edit(Agent entity) {
		return agentMapper.updateByPrimaryKey(entity);
	}

	@Override
	public Agent get(int id) {
		return agentMapper.selectByPrimaryKey(id);
	}

	@Override
	public PageBean list(int currentPage, int pageSize) {
		PageBean pageBean = new PageBean();
		AgentExample example = new AgentExample();
		PageHelper.startPage(currentPage, pageSize);
		List<Agent> list = agentMapper.selectByExample(example);
		PageInfo<Agent> info = new PageInfo<Agent>(list);
		long total = info.getTotal();
		int totalPage = (int) ((total + pageSize - 1) / pageSize);
		pageBean.setTotalPage(totalPage);
		pageBean.setTotal(total);
		pageBean.setRows(list);
		pageBean.setCurrentPage(currentPage);
		return pageBean;
	}

	@Override
	public int delete(Agent entity) {
		AgentExample example = new AgentExample();
		return agentMapper.deleteByExample(example);
	}

	@Override
	public int deleteById(int id) {
		// TODO Auto-generated method stub
		return agentMapper.deleteByPrimaryKey(id);
	}

	@Override
	public List<Agent> selectAll() {
		AgentExample example = new AgentExample();
		return agentMapper.selectByExample(example);
	}

	@Override
	public PageBean findByWeixin(int currentPage, int pageSize, String refereeWeixin) {
		PageBean pageBean = new PageBean();
		AgentExample example = new AgentExample();
		example.createCriteria().andRefereeWeixinEqualTo(refereeWeixin);
		PageHelper.startPage(currentPage, pageSize);
		List<Agent> list = agentMapper.selectByExample(example);
		PageInfo<Agent> info = new PageInfo<Agent>(list);
		long total = info.getTotal();
		int totalPage = (int) ((total + pageSize - 1) / pageSize);
		pageBean.setTotalPage(totalPage);
		pageBean.setTotal(total);
		pageBean.setRows(list);
		pageBean.setCurrentPage(currentPage);
		return pageBean;
	}

	@Override
	public PageBean findByCondition(int currentPage, int pageSize, String name, String weixin, String level) {
		PageBean pageBean = new PageBean();
		AgentExample example = new AgentExample();
		Criteria criteria = example.createCriteria();
		if (StringUtils.isNotBlank(name)) {
			criteria.andNameEqualTo(name);
		}
		if (StringUtils.isNotBlank(weixin)) {
			criteria.andWeixinEqualTo(weixin);
		}
		if ("1".equals(level) || "2".equals(level)) {
			criteria.andLevelEqualTo(Integer.parseInt(level));
		}
		PageHelper.startPage(currentPage, pageSize);
		List<Agent> list = agentMapper.selectByExample(example);
		PageInfo<Agent> info = new PageInfo<Agent>(list);
		long total = info.getTotal();
		int totalPage = (int) ((total + pageSize - 1) / pageSize);
		pageBean.setTotalPage(totalPage);
		pageBean.setTotal(total);
		pageBean.setRows(list);
		pageBean.setCurrentPage(currentPage);
		return pageBean;
	}

	@Override
	public int getCount() {
		return agentMapper.getCount();
	}

	@Override
	public int getCountByrefereeWeixin(String refereeWeixin) {
		return agentMapper.getCountByrefereeWeixin(refereeWeixin);
	}

	@Override
	public Agent getByWeixin(String weixin) {
		AgentExample example = new AgentExample();
		example.createCriteria().andWeixinEqualTo(weixin);
		List<Agent> list = this.agentMapper.selectByExample(example);
		if (null != list && list.size() > 0) {
			return list.get(0);
		}
		return null;
	}

}