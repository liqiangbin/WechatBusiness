package com.cn.hnust.dao;

import com.cn.hnust.pojo.Agent;
import com.cn.hnust.pojo.AgentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AgentMapper {
	int countByExample(AgentExample example);

	int deleteByExample(AgentExample example);

	int deleteByPrimaryKey(Integer id);

	int insert(Agent record);

	int insertSelective(Agent record);

	List<Agent> selectByExample(AgentExample example);

	Agent selectByPrimaryKey(Integer id);

	int updateByExampleSelective(@Param("record") Agent record, @Param("example") AgentExample example);

	int updateByExample(@Param("record") Agent record, @Param("example") AgentExample example);

	int updateByPrimaryKeySelective(Agent record);

	int updateByPrimaryKey(Agent record);

	int getCount();

	int getCountByrefereeWeixin(String refereeWeixin);
}