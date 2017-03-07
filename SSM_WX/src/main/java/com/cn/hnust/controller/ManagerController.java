/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.cn.hnust.controller;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cn.hnust.controller.base.BaseController;
import com.cn.hnust.pojo.Manager;
import com.cn.hnust.service.IManagerService;


/**
 * 管理Controller
 * @author ccl
 * @version 2016-09-16
 */
@Controller
@RequestMapping(value = "/manager")
public class ManagerController extends BaseController {
	@Autowired
	private IManagerService managerService;
	@RequestMapping("/login")
	 public String toIndex(HttpServletRequest request,Model model,Manager manager,HttpSession session) throws ParseException{  
		System.out.println("login---");
		int error=0;
		List<Manager> managers=new ArrayList<Manager>();
		if(manager==null){
			System.out.println("return====size==0");
		return "redirect:/user/login.html";
		}
		managers= managerService.list(manager.getName(), manager.getPassword());
		if(managers.size()!=1){
       	 error=1;
       	 model.addAttribute("error", error);
       	return "login"; 
       }else{
    	 //添加登录者session信息
  		 session.setAttribute("manager",managers.get(0));
         return "redirect:/order/tradeQueryParams.html"; 
       }
		
   }  
	
	@RequestMapping("/logout")
	 public String logout(HttpServletRequest request,Model model,Manager manager,HttpSession session) throws ParseException{  
		//删除登录者session信息
		 session.removeAttribute("manager");
      return "redirect:/user/login.html"; 
  }  
	
	@RequestMapping("/editPassword")
	 public String editPassword(HttpServletRequest request,Model model,HttpSession session) throws ParseException{  
		//删除登录者session信息
		Manager manager=(Manager) session.getAttribute("manager");
		if(manager==null){
			return "redirect:/user/login.html";
		}
		model.addAttribute(manager);
     return "passwordEdit"; 
 }  
	
	@RequestMapping("/passwordSave")
	 public String passwordSave(HttpServletRequest request,Model model,Manager manager,HttpSession session) throws ParseException{  
		//删除登录者session信息
		System.out.println("保存密码="+manager.getPassword()+"id="+manager.getId());
		int status=managerService.edit(manager);
		if(status==1){
		model.addAttribute("passwordEditInfo", "修改成功，下次请通过新密码登录！");	
		model.addAttribute("color", "green");
		}else{
			model.addAttribute("passwordEditInfo", "修改失败,请重试！");	
			model.addAttribute("color", "red");
		}
    return "passwordEdit"; 
}
	
	
	

}