/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.cn.hnust.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cn.hnust.controller.base.BaseController;
import com.cn.hnust.pojo.Business;
import com.cn.hnust.pojo.Package_;
import com.cn.hnust.service.IPackage_Service;
import com.cn.hnust.service.IbusinessService;

/**
 * 代理商Controller
 * 
 * @author ccl
 * @version 2016-09-16
 */
@Controller
@RequestMapping("/package_")
public class Package_Controller extends BaseController {

	@Autowired
	private IPackage_Service package_Service;

	@Autowired
	private IbusinessService businessService;
	
	@RequestMapping("/tancanList")
	public String showPage(Model model, @RequestParam(defaultValue = "1") int currentPage,
			@RequestParam(defaultValue = "5") int pageSize) {
		List<Business> businessList=businessService.selectAll();
		model.addAttribute("businessList", businessList);
		model.addAttribute("pageBean", package_Service.list(currentPage, pageSize));
		return "tancanList";
	}

	@RequestMapping("/toAdd")
	public String showAdd(Model model) {
		List<Business> businessList=businessService.selectAll();
		model.addAttribute("businessList", businessList);
		return "taocanAdd";
	}

	@RequestMapping("/taocanAdd")
	public String save(Package_ pack) {
		package_Service.save(pack);
		return "redirect:/package_/tancanList.html"; 
	}

	@RequestMapping("/taocanEdit")
	public String edit(int id, Model model) {
		List<Business> businessList=businessService.selectAll();
		model.addAttribute("businessList", businessList);
		model.addAttribute("pa", package_Service.get(id));
		return "taocanEdit";
	}
	@RequestMapping("/delete")
	public String delete(int id) {
		package_Service.deleteById(id);
		return "redirect:/package_/tancanList.html"; 
	}

	@RequestMapping("/editToSave")
	public String editToSave(Package_ pa) {
		System.out.println(pa.getType()+"|"+pa.getName());
		package_Service.edit(pa);
		return "redirect:/package_/tancanList.html"; 
	}

}