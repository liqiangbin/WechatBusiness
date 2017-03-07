/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.cn.hnust.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cn.hnust.controller.base.BaseController;
import com.cn.hnust.pojo.Leader;
import com.cn.hnust.service.ILeaderService;


/**
 * 领导Controller
 * @author ccl
 * @version 2016-09-16
 */
@Controller
@RequestMapping("/leader")
public class LeaderController extends BaseController {

	@Autowired
	private ILeaderService leaderService;
	
	@RequestMapping("/leaderList")
	public String showPage(@RequestParam(defaultValue = "1") int currentPage,
			@RequestParam(defaultValue = "5") int pageSize, Model model){
		model.addAttribute("pageBean", leaderService.list(currentPage, pageSize));
		return "leaderList";
	}
	
	@RequestMapping("/toAdd")
	public String toAdd(){
		return "leaderAdd";
	}
	@RequestMapping("/leaderAdd")
	public String save(Leader leader){
		leaderService.save(leader);
		return "redirect:/leader/leaderList.html"; 
	}
	
	@RequestMapping("/leaderEdit")
	public String showEdit(int id,Model model){
		model.addAttribute("leader", leaderService.get(id));
		return "leaderEdit";
	}
	
	@RequestMapping("/editToSave")
	public String editToSave(Leader leader){
		leaderService.edit(leader);
		return "redirect:/leader/leaderList.html"; 
	}
	
	@RequestMapping("/delete")
	public String delete(int id){
		leaderService.deleteById(id);
		return "redirect:/leader/leaderList.html"; 
	}
	
}