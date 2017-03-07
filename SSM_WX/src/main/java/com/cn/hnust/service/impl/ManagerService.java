/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.cn.hnust.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cn.hnust.dao.ManagerMapper;
import com.cn.hnust.pojo.Manager;
import com.cn.hnust.pojo.ManagerExample;
import com.cn.hnust.pojo.ManagerExample.Criteria;
import com.cn.hnust.service.IManagerService;

/**
 * 管理Service
 * @author ccl
 * @version 2016-09-16
 */
@Service
@Transactional(readOnly = true)
public class ManagerService implements IManagerService {

	@Resource
	private ManagerMapper managerMapper;
	
	@Override
	public int save(Manager entity) {
		// TODO Auto-generated method stub
		return managerMapper.insert(entity);
	}

	@Override
	public int edit(Manager entity) {
		// TODO Auto-generated method stub
		return managerMapper.updateByPrimaryKey(entity);
	}

	@Override
	public Manager get(int id) {
		// TODO Auto-generated method stub
		return managerMapper.selectByPrimaryKey(id);
	}

	@Override
	public List<Manager> list(String name,String password) {
		ManagerExample example=new ManagerExample();
		Criteria cirteria=example.createCriteria();
		cirteria.andNameEqualTo(name);
		cirteria.andPasswordEqualTo(password);
		return managerMapper.selectByExample(example);
	}

	@Override
	public int delete(Manager entity) {
		ManagerExample example=new ManagerExample();
		// TODO Auto-generated method stub
		return managerMapper.deleteByExample(example);
	}

	@Override
	public int deleteById(int id) {
		// TODO Auto-generated method stub
		return managerMapper.deleteByPrimaryKey(id);
	}

	@Override
	public List<Manager> list() {
		// TODO Auto-generated method stub
		return null;
	}

}