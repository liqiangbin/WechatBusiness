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
import com.cn.hnust.pojo.Business;
import com.cn.hnust.pojo.Package_;
import com.cn.hnust.service.IbusinessService;

/**
 * 代理商Controller
 * 
 * @author ccl
 * @version 2016-09-16
 */
@Controller
@RequestMapping("/business")
public class Business_Controller extends BaseController {

	@Autowired
	private IbusinessService businessService;

	@RequestMapping("/businessList")
	public String showPage(Model model, @RequestParam(defaultValue = "1") int currentPage,
			@RequestParam(defaultValue = "5") int pageSize) {
		model.addAttribute("pageBean", businessService.list(currentPage, pageSize));  
		return "businessList";
	}

	@RequestMapping("/toAdd")
	public String showAdd() {
		return "businessAdd";
	}

	@RequestMapping("/add")
	public String save(Business pack) {
		businessService.save(pack);
		return "redirect:/business/businessList.html"; 
	}

	@RequestMapping("/edit")
	public String edit(int id, Model model) {
		model.addAttribute("pa", businessService.get(id));
		return "businessEdit";
	}

	@RequestMapping("/delete")
	public String delete(int id) {
		businessService.deleteById(id);
		return "redirect:/business/businessList.html"; 
	}

	@RequestMapping("/editToSave")
	public String editToSave(Business pa) {
		businessService.edit(pa);
		return "redirect:/business/businessList.html"; 
	}

}