/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.cn.hnust.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cn.hnust.dao.UserMapper;
import com.cn.hnust.pojo.User;
import com.cn.hnust.pojo.UserExample;
import com.cn.hnust.pojo.UserExample.Criteria;
import com.cn.hnust.service.IUserService;
import com.cn.hnust.utils.PageBean;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

/**
 * 用户Service
 * 
 * @author ccl
 * @version 2016-09-16
 */
@Service
@Transactional(readOnly = true)
public class UserService implements IUserService {

	@Resource
	private UserMapper userMapper;

	@Override
	public int save(User user) {
		// TODO Auto-generated method stub
		return userMapper.insert(user);
	}

	@Override
	public int edit(User user) {
		// TODO Auto-generated method stub
		return userMapper.updateByPrimaryKey(user);
	}

	@Override
	public User get(int id) {
		// TODO Auto-generated method stub
		return userMapper.selectByPrimaryKey(id);
	}

	public PageBean list(int currentPage, int pageSize) {
		PageBean pageBean = new PageBean();
		UserExample example = new UserExample();
		PageHelper.startPage(currentPage, pageSize);
		List<User> list = userMapper.selectByExample(example);
		PageInfo<User> info = new PageInfo<User>(list);
		long total = info.getTotal();
		int totalPage = (int) ((total + pageSize - 1) / pageSize);
		pageBean.setTotalPage(totalPage);
		pageBean.setTotal(total);
		pageBean.setRows(list);
		pageBean.setCurrentPage(currentPage);
		return pageBean;
	}

	@Override
	public int delete(User user) {
		UserExample example = new UserExample();
		return userMapper.deleteByExample(example);
	}

	@Override
	public int deleteById(int id) {
		// TODO Auto-generated method stub
		return userMapper.deleteByPrimaryKey(id);
	}

	@Override
	public List<User> selectAll(Map<String, String> params) {
		// UserExample example=new UserExample();
		// Criteria criteria =example.createCriteria();
		// for(Map.Entry<String,String> entry:params.entrySet()){
		// if("weixin".equals(entry.getKey())){
		// criteria.andWeixinEqualTo(entry.getValue());
		// }else if("agentweixin".equals(entry.getKey())){
		//
		// }
		// }
		return userMapper.getUserByParams(params);
	}

	@Override
	public PageBean findByAgentid(int currentPage, int pageSize, String weixin) {
		PageBean pageBean = new PageBean();
		UserExample example = new UserExample();
		example.createCriteria().andAgentWeixinEqualTo(weixin); // AEqualTo(weixin);
		PageHelper.startPage(currentPage, pageSize);
		List<User> list = userMapper.selectByExample(example);
		PageInfo<User> info = new PageInfo<User>(list);
		long total = info.getTotal();
		int totalPage = (int) ((total + pageSize - 1) / pageSize);
		pageBean.setTotalPage(totalPage);
		pageBean.setTotal(total);
		pageBean.setRows(list);
		pageBean.setCurrentPage(currentPage);
		return pageBean;
	}

	@Override
	public int findCountByWeixin(String weixin) {
		userMapper.getCountByAWeixin(weixin);
		return 0;
	}

	@Override
	public int getCountByWeixin(String weixin) {
		UserExample example = new UserExample();
		example.createCriteria().andAgentWeixinEqualTo(weixin);
		List<User> list = this.userMapper.selectByExample(example);
		if (null == list || list.size() == 0) {
			return 0;
		}
		return list.size();
	}

}