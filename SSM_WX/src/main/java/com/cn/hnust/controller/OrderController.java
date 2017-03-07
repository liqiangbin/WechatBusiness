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

import com.cn.hnust.controller.base.BaseController;
import com.cn.hnust.pojo.Business;
import com.cn.hnust.pojo.Order;
import com.cn.hnust.pojo.TradeQuery;
import com.cn.hnust.service.IOrderService;
import com.cn.hnust.service.impl.BusinessService;


/**
 * orderController
 * @author ccl
 * @version 2016-09-16
 */
@Controller
@RequestMapping("/order")
public class OrderController extends BaseController {

	@Autowired
	private IOrderService orderService;
	@Autowired
	private BusinessService businessService;
	
	@RequestMapping("/tradeQuery")
	public String showPage(Model model){
		List<Business> businessList= businessService.selectAll();
		System.out.println("businessList="+businessList.size());
		model.addAttribute("businessList", businessList);
		return "tradeQuery";
	}
	
	@RequestMapping("/tradeQueryParams")
	public String showPageParams(TradeQuery tradeQuery,Model model) throws ParseException{
		boolean thisMonth=true;
		System.out.println("************************************");
		Map<String,Object> condation=new HashMap<String,Object>();
		Date dateNow=new Date();
		Date start=tradeQuery.getStartDate();
		Date endtime=tradeQuery.getEndDate();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//
		SimpleDateFormat dateMonthform = new SimpleDateFormat("yyyy-MM");
		String startString="";
		String endString="";
		if(null!=start){
			thisMonth=false;
			startString=dateFormat.format(start);
		}else{
			thisMonth=true;
			String month=dateMonthform.format(dateNow);
			startString=dateFormat.format(dateMonthform.parse(month));
			start=dateFormat.parse(startString);
			tradeQuery.setStartDate(start);
		}
		if(null!=endtime){
			 endString=dateFormat.format(endtime);
		 }else{
			System.out.println("------------------"+dateNow.toString());
			 endString=dateFormat.format(dateNow);
			 endtime=dateFormat.parse(endString);
			 tradeQuery.setEndDate(endtime);
		 }
		int businessId=0;
		businessId=tradeQuery.getYewuId();
		condation.put("startTime", startString);
		condation.put("endTime",endString);
		condation.put("yewuid", businessId);
		List<Order> orderList=orderService.selectByParams(condation);
		
		//判断是否为当前月
		if(thisMonth){
			if(orderList.size()>0){
				tradeQuery.setNum(orderList.size());
				double money=0;
				for (Order order : orderList) {
					money+=order.getSum();
				}
				tradeQuery.setMoney(money);
				tradeQuery.setNumTitle("当月交易笔数");
				tradeQuery.setMoneyTitle("当月交易额");
			}else{
				tradeQuery.setNum(0);
				tradeQuery.setMoney(0);
				tradeQuery.setNumTitle("当月交易笔数");
				tradeQuery.setMoneyTitle("当月交易额");
			}
			
		}else{
			if(orderList.size()>0){
				tradeQuery.setNum(orderList.size());
				double money=0;
				for (Order order : orderList) {
					money+=order.getSum();
				}
				tradeQuery.setMoney(money);
				tradeQuery.setNumTitle("查询条件范围内交易笔数");
				tradeQuery.setMoneyTitle("查询条件范围内交易额");
			}else{
				tradeQuery.setNum(0);
				tradeQuery.setMoney(0);
				tradeQuery.setNumTitle("查询日期条件内交易笔数");
				tradeQuery.setMoneyTitle("查询条件范围内交易额");
			}
		}
		
		condation=new HashMap<String,Object>();
		condation.put("startTime", "");
		condation.put("endTime","");
		condation.put("yewuid", 0);
		List<Order> allOrderList=orderService.selectByParams(condation);
		double totalMoney=0;
		int totalNum=0;
		if(allOrderList.size()>0){
			totalNum=allOrderList.size();
			for (Order order : allOrderList) {
				totalMoney+=order.getSum();
			}
		}
		tradeQuery.setTotalNum(totalNum);
		tradeQuery.setTotalMoney(totalMoney);
		List<Business> businessList= businessService.selectAll();
		model.addAttribute("businessList", businessList);
		model.addAttribute("tradeQuery", tradeQuery);
//		System.out.println("size="+orderList.size());
		return "tradeQuery";
	}

}