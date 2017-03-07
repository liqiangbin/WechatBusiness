package com.cn.hnust.utils;

import java.util.List;

/**
 * 封装分页信息
 * 
 * @author zhaoqx
 *
 */
public class PageBean {
	private int currentPage;// 当前页码
	private int pageSize;// 每页显示记录数
	private Long total;// 总记录数
	@SuppressWarnings("rawtypes")
	private List rows;// 当前页需要展示的数据集合
	// 总页数
	private int totalPage;

	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}

	public int getTotalPage() {
		return totalPage;
	}

	public int getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public Long getTotal() {
		return total;
	}

	public void setTotal(Long total) {
		this.total = total;
	}

	@SuppressWarnings("rawtypes")
	public List getRows() {
		return rows;
	}

	@SuppressWarnings("rawtypes")
	public void setRows(List rows) {
		this.rows = rows;
	}

}
