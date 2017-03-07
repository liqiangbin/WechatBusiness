package com.cn.hnust.service;

import java.util.List;
import java.util.Map;

import com.cn.hnust.pojo.Order;
import com.cn.hnust.utils.PageBean;

public interface IOrderService {
	public int save(Order entity);

	public int edit(Order entity);

	public Order get(int id);

	public PageBean list(int currentPage,int pageSize);

	public int delete(Order entity);

	public int deleteById(int id);
	
	public  List<Order> selectByParams(Map condation);
	
	
}
