package com.cn.hnust.service;

import java.util.List;

import com.cn.hnust.pojo.Business;
import com.cn.hnust.pojo.Leader;
import com.cn.hnust.utils.PageBean;

public interface IbusinessService {
	public int save(Business entity);

	public int edit(Business entity);

	public Business get(int id);

	public int deleteById(int id);

	public PageBean list(int currentPage,int pageSize);
	
	public List<Business> selectAll();
}
