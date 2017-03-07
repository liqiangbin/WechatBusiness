package com.cn.hnust.pojo;

import java.util.Date;

public class TradeQuery {
	
	    private Date startDate ;

	    private Date endDate ;
	    
	    private int yewuId;
	    
	    private String moneyTitle;
	    
	    private double money;
	    
	    private String numTitle;
	    
	    private int num ;
	    
	    private int totalNum ;
	    
	    private double totalMoney;

		
		public int getTotalNum() {
			return totalNum;
		}

		public void setTotalNum(int totalNum) {
			this.totalNum = totalNum;
		}

		public double getTotalMoney() {
			return totalMoney;
		}

		public void setTotalMoney(double totalMoney) {
			this.totalMoney = totalMoney;
		}

		public String getMoneyTitle() {
			return moneyTitle;
		}

		public void setMoneyTitle(String moneyTitle) {
			this.moneyTitle = moneyTitle;
		}

		public double getMoney() {
			return money;
		}

		public void setMoney(double money) {
			this.money = money;
		}

		public String getNumTitle() {
			return numTitle;
		}

		public void setNumTitle(String numTitle) {
			this.numTitle = numTitle;
		}

		public int getNum() {
			return num;
		}

		public void setNum(int num) {
			this.num = num;
		}

		public Date getStartDate() {
			return startDate;
		}

		public void setStartDate(Date startDate) {
			this.startDate = startDate;
		}

		

		public Date getEndDate() {
			return endDate;
		}

		public void setEndDate(Date endDate) {
			this.endDate = endDate;
		}

		public int getYewuId() {
			return yewuId;
		}

		public void setYewuId(int yewuId) {
			this.yewuId = yewuId;
		}
	    
	   
}
