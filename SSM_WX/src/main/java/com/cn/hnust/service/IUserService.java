package com.cn.hnust.service;

import java.util.List;
import java.util.Map;

import com.cn.hnust.pojo.User;
import com.cn.hnust.utils.PageBean;

public interface IUserService {
	public int save(User user);

	public int edit(User user);

	public User get(int id);

	public PageBean list(int currentPage,int pageSize);

	public int delete(User user);

	public int deleteById(int id);
	
	public List<User> selectAll(Map<String,String> params);

	public PageBean findByAgentid(int currentPage, int pageSize, String weixin);

	public int findCountByWeixin(String weixin);

	public int getCountByWeixin(String weixin);
}
