/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.cn.hnust.controller;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cn.hnust.controller.base.BaseController;
import com.cn.hnust.pojo.Agent;
import com.cn.hnust.pojo.Business;
import com.cn.hnust.pojo.Leader;
import com.cn.hnust.pojo.Order;
import com.cn.hnust.pojo.Package_;
import com.cn.hnust.pojo.User;
import com.cn.hnust.service.IAgentService;
import com.cn.hnust.service.ILeaderService;
import com.cn.hnust.service.IOrderService;
import com.cn.hnust.service.IPackage_Service;
import com.cn.hnust.service.IUserService;
import com.cn.hnust.service.IbusinessService;
import com.cn.hnust.utils.PageBean;
import com.mysql.jdbc.StringUtils;

/**
 * 用户Controller
 * 
 * @author ccl
 * @version 2016-09-16
 */
@Controller
@RequestMapping("/user")
public class UserController extends BaseController {

	@Autowired
	private IUserService userService;
	@Autowired
	private IOrderService orderService;
	@Autowired
	private IbusinessService businessService;
	@Autowired
	private IPackage_Service package_Service;
	@Autowired
	private IAgentService agentService;
	@Autowired
	private ILeaderService iLeaderService;

	@RequestMapping("/userList")
	public String showPage(Model model, @RequestParam(defaultValue = "1") int currentPage,
			@RequestParam(defaultValue = "5") int pageSize, int agentId) {
		Agent agent2 = this.agentService.get(agentId);
		String weixin = agent2.getWeixin();
		int findCountByWeixin = this.userService.getCountByWeixin(weixin);
		agent2.setCountUser(findCountByWeixin);
		this.agentService.edit(agent2);
		
		Agent agent = agentService.get(agentId);
		model.addAttribute("agent", agent);
		System.out.println("agent.getWeixin()="+agent.getWeixin());
		PageBean pageBean = userService.findByAgentid(currentPage, pageSize, agent.getWeixin());
		model.addAttribute("pageBean", pageBean);
		model.addAttribute("agentId", agentId);
		List<Leader> leaderList=iLeaderService.getList();
		model.addAttribute("leaderList", leaderList);
		
		Map<String,String> condatiton=new HashMap<>();
		condatiton.put("yewuid", "0");
		List<Order> orderList=orderService.selectByParams(condatiton);
		System.out.println("orderList.size()="+orderList.size());
		model.addAttribute("orderList", orderList);
		
		List<Business> businessList = businessService.selectAll();
		List<Package_> packageList = package_Service.selectAll();
		model.addAttribute("businessList", businessList);
		model.addAttribute("packageList", packageList);
		return "userList";
	}

	@RequestMapping("/toUserAdd")
	public String toUserAdd(Model model) {
		List<Business> businessList = businessService.selectAll();
		List<Package_> packageList = package_Service.selectAll();
		List<Agent> agentList = agentService.selectAll();
		List<Leader> leaderList = iLeaderService.getList();
		model.addAttribute("businessList", businessList);
		model.addAttribute("packageList", packageList);
		model.addAttribute("agentList", agentList);
		model.addAttribute("leaderList", leaderList);
		return "/html/userAdd";
	}

	@RequestMapping("/userAdd")
	public String save(User user, Model model, Order order) throws ParseException {
		String errMsg = "";
		Date date = new Date();
		DateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date time = format.parse(format.format(date));
		order.setOrdertime(time);
		user.setCreatetime(time);
//		String userWeixin = user.getWeixin();
		Map<String, String> params = new HashMap<String, String>();
		int userId = 0;
		int isAddCusNum=1;
			try {
				isAddCusNum=userService.save(user);
				errMsg = "报单成功！";
			} catch (Exception e) {
				isAddCusNum=0;
				errMsg = "报单失败，请重试！";
			}

			userId = userService.selectAll(params).get(0).getId();
//		}
		// 获取代理商微信，更新代理商客户订单数量
		if(isAddCusNum>0){
		String agentWeixin = user.getAgentweixin();
		List<Agent> agentList = agentService.selectAll();
		for (Agent agent : agentList) {
			if (null != agent && null != agentWeixin && agentWeixin.equals(agent.getWeixin())) {
				System.out.println(agentWeixin + "|" + agent.getWeixin());
				int count = agent.getCountUser();
				count += 1;
				agent.setCountUser(count);
				agentService.edit(agent);
				break;
			} else {
				System.out.println("没有找到对应代理商！不计数");
			}
		}
		
		order.setUserid(userId);
		try {
			if(order.getYewuid()!=null){
				orderService.save(order);
				errMsg = "报单成功！";
			}else{
				errMsg = "";
			}
			
		} catch (Exception e) {
			errMsg = "报单失败，请重试！";
		}
		}
		model.addAttribute("errMsg", errMsg);
		List<Business> businessList = businessService.selectAll();
		List<Package_> packageList = package_Service.selectAll();
		List<Agent> agentList1 = agentService.selectAll();
		List<Leader> leaderList = iLeaderService.getList();
		model.addAttribute("businessList", businessList);
		model.addAttribute("packageList", packageList);
		model.addAttribute("agentList", agentList1);
		model.addAttribute("leaderList", leaderList);
		
		return "/html/userAdd";
	}

	@RequestMapping("/userEdit")
	public String edit() {
		return "userEdit";
	}

	@RequestMapping("/passwordEdit")
	public String editPwd() {
		return "passwordEdit";
	}

	@RequestMapping("/login")
	public String login() {
		return "login";
	}
	
	@RequestMapping("/delete")
	public String delete(int UserId,int orderId,int agentId) {
		this.orderService.deleteById(orderId);
		this.userService.deleteById(UserId);
		Agent agent = this.agentService.get(agentId);
		Integer num = agent.getCountUser()-1;
		agent.setCountUser(num);
		this.agentService.edit(agent);
		return "redirect:/user/userList.html?agentId="+agentId;
	}
	
	@RequestMapping("/newUserAdd")
	public String newUserAdd() {
		return "/html/userAdd";
	}


}