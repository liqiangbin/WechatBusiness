package com.cn.hnust.service;

import java.util.List;

import com.cn.hnust.pojo.Leader;
import com.cn.hnust.utils.PageBean;

public interface ILeaderService {
	public int save(Leader entity);

	public int edit(Leader entity);

	public Leader get(int id);

	public PageBean list(int currentPage,int pageSize);

	public int delete(Leader entity);

	public int deleteById(int id);

	public List<Leader> getList();
}
