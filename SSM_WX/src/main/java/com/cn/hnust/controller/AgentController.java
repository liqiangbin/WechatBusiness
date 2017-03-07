/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.cn.hnust.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cn.hnust.pojo.Agent;
import com.cn.hnust.pojo.Leader;
import com.cn.hnust.service.IAgentService;
import com.cn.hnust.service.ILeaderService;
import com.cn.hnust.utils.PageBean;

/**
 * 代理商Controller
 * @author ccl
 * @version 2016-09-16
 */
@Controller
@RequestMapping("/agent")
public class AgentController {
	@Autowired
	private IAgentService agentService;
	@Autowired
	private ILeaderService leaderService;
	@Autowired
	private ILeaderService iLeaderService;

	@RequestMapping("/agent1Add")
	public String saveAgent1(Agent agent, Model model) {
		String errMsg = "";
		try {
			agent.setCreatetime(new Date());
			agent.setLevel(2);
			agent.setCountSubAgents(0);
			agent.setCountUser(0);
			agent.setType(""+2);
			agentService.save(agent);
			errMsg = "报单成功！";
			Agent ag = agentService.getByWeixin(agent.getRefereeWeixin());
			if (ag != null) {
				ag.setCountSubAgents(ag.getCountSubAgents() + 1);
				agentService.edit(ag);
			}
			
		} catch (Exception e) {
			errMsg = "报单失败！";
			e.printStackTrace();
		}
		model.addAttribute("errMsg", errMsg);
		model.addAttribute("list", leaderService.getList());
		return "html/agent1";
	}
	@RequestMapping("/agent2Add")
	public String agent2Add(Agent agent, Model model) {
		String errMsg = "";
		try {
			agent.setCreatetime(new Date());
			agent.setLevel(1);
			agent.setCountSubAgents(0);
			agent.setCountUser(0);
			agent.setType(""+1);
			agentService.save(agent);
			Agent ag = agentService.getByWeixin(agent.getRefereeWeixin());
			if (ag != null) {
				ag.setCountSubAgents(ag.getCountSubAgents() + 1);
				agentService.edit(ag);
			}
			errMsg = "报单成功！";
		} catch (Exception e) {
			errMsg = "报单失败！";
			e.printStackTrace();
		}
		model.addAttribute("errMsg", errMsg);
		model.addAttribute("list", leaderService.getList());
		return "html/agent2";
	}
	/**
	 * 代理商列表
	 * @return
	 */
	@RequestMapping("/agentList")
	public String showPage(@RequestParam(defaultValue = "1") int currentPage,
			@RequestParam(defaultValue = "5") int pageSize, Model model) {
		// agentService.countSub_agent();
		PageBean pageBean = agentService.list(currentPage, pageSize);
		model.addAttribute("pageBean", pageBean);
		model.addAttribute("total", agentService.getCount());
		List<Leader> leaderList = iLeaderService.getList();
		model.addAttribute("leaderList", leaderList);
		return "agentList";
	}
	// 条件分页查询
	@RequestMapping("/query")
	public String query(@RequestParam(defaultValue = "1") int currentPage,
			@RequestParam(defaultValue = "5") int pageSize, String name, String weixin, String level, Model model) {
		// agentService.countSub_agent();
		model.addAttribute("name", name);
		model.addAttribute("weixin", weixin);
		model.addAttribute("level", level);
		PageBean pageBean = agentService.findByCondition(currentPage, pageSize, name, weixin, level);
		model.addAttribute("pageBean", pageBean);
		model.addAttribute("total", agentService.getCount());
		List<Leader> leaderList = iLeaderService.getList();
		model.addAttribute("leaderList", leaderList);
		return "agentList";
	}
	@RequestMapping("/agent1")
	public String showPage1(Model model) {
		model.addAttribute("leaderList", leaderService.getList());
		model.addAttribute("agentList", agentService.selectAll());
		return "html/agent1";
	}
	@RequestMapping("/agent2")
	public String showPage2(Model model) {
		model.addAttribute("leaderList", leaderService.getList());
		model.addAttribute("agentList", agentService.selectAll());
		return "html/agent2";
	}
	@RequestMapping("/toEdit")
	public String showAgentEdit(int id, Model model) {
		model.addAttribute("list", leaderService.getList());
		model.addAttribute("agent", agentService.get(id));
		return "agentEdit";
	}
	@RequestMapping("/agentEdit")
	public String agentEdit(Agent agent, Model model) {
		agentService.edit(agent);
		return "redirect:/agent/agentList.html";
	}
	@RequestMapping("/delete")
	public String delete(int id) {
		agentService.deleteById(id);
		return "redirect:/agent/agentList.html";
	}
	@RequestMapping("/agent1Detial")
	public String agent1Detial(String weixin, @RequestParam(defaultValue = "1") int currentPage,
			@RequestParam(defaultValue = "5") int pageSize, Model model) {
		PageBean pageBean = this.agentService.findByWeixin(currentPage, pageSize, weixin);
		model.addAttribute("pageBean", pageBean);
		model.addAttribute("agent", this.agentService.getByWeixin(weixin));
		List<Leader> leaderList = iLeaderService.getList();
		model.addAttribute("leaderList", leaderList);
		return "agent1Detial";
	}
}
