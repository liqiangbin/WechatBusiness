/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.cn.hnust.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cn.hnust.dao.OrderMapper;
import com.cn.hnust.pojo.Leader;
import com.cn.hnust.pojo.LeaderExample;
import com.cn.hnust.pojo.Order;
import com.cn.hnust.pojo.OrderExample;
import com.cn.hnust.service.IOrderService;
import com.cn.hnust.utils.PageBean;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

/**
 * orderService
 * 
 * @author ccl
 * @version 2016-09-16
 */
@Service
@Transactional(readOnly = true)
public class OrderService implements IOrderService {

	@Resource
	private OrderMapper orderMapper;

	@Override
	public int save(Order entity) {
		// TODO Auto-generated method stub
		return orderMapper.insert(entity);
	}

	@Override
	public int edit(Order entity) {
		// TODO Auto-generated method stub
		return orderMapper.updateByPrimaryKey(entity);
	}

	@Override
	public Order get(int id) {
		// TODO Auto-generated method stub
		return orderMapper.selectByPrimaryKey(id);
	}

	@Override
	public PageBean list(int currentPage, int pageSize) {
		PageBean pageBean = new PageBean();
		OrderExample example = new OrderExample();
		PageHelper.startPage(currentPage, pageSize);
		List<Order> list = orderMapper.selectByExample(example);
		PageInfo<Order> info = new PageInfo<Order>(list);
		long total = info.getTotal();
		int totalPage=(int) ((total+ pageSize  - 1)/pageSize);
		pageBean.setTotalPage(totalPage);
		pageBean.setTotal(total);
		pageBean.setRows(list);
		pageBean.setCurrentPage(currentPage);
		return pageBean;
	}

	@Override
	public int delete(Order entity) {
		OrderExample example = new OrderExample();
		return orderMapper.deleteByExample(example);
	}

	@Override
	public int deleteById(int id) {
		// TODO Auto-generated method stub
		return orderMapper.deleteByPrimaryKey(id);
	}

	@Override
	public List<Order> selectByParams(Map condation) {
		// TODO Auto-generated method stub
		return orderMapper.selectByParams(condation);
	}

}