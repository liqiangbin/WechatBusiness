package com.cn.hnust.service;

import java.util.List;

import com.cn.hnust.pojo.Agent;
import com.cn.hnust.utils.PageBean;

public interface IAgentService {
	public int save(Agent entity);

	public int edit(Agent entity);

	public Agent get(int id);

	public PageBean list(int currentPage,int pageSize);

	public int delete(Agent entity);

	public int deleteById(int id);
	
	public List<Agent> selectAll();

	public PageBean findByWeixin(int currentPage, int pageSize,String refereeWeixin);

	public PageBean findByCondition(int currentPage, int pageSize, String name, String weixin, String level);

	public int getCount();
	
	public int getCountByrefereeWeixin(String refereeWeixin);

	public Agent getByWeixin(String weixin);
}
