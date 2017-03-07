package com.cn.hnust.service;

import java.util.List;

import com.cn.hnust.pojo.Manager;

public interface IManagerService {
	public int save(Manager entity);

	public int edit(Manager entity);

	public Manager get(int id);

	public List<Manager> list();

	public int delete(Manager entity);

	public int deleteById(int id);

	List<Manager> list(String name, String password);
}
