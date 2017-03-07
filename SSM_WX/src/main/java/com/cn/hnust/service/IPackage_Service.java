package com.cn.hnust.service;

import java.util.List;

import com.cn.hnust.pojo.Package_;
import com.cn.hnust.utils.PageBean;

public interface IPackage_Service {
	public int save(Package_ entity);

	public int edit(Package_ entity);

	public Package_ get(int id);

	public PageBean list(int currentPage,int pageSize);

	public int delete(Package_ entity);

	public int deleteById(int id);
	
	public List<Package_> selectAll();
}
