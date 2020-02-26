package com.bw.vo;

import com.bw.pojo.Movie;

public class MovieVO extends Movie{
	private Integer pageNum;
	private String startTime;
	private String endTime;
	private Double startPrice;
	private Double endPrice;
	private Integer startTimelong;
	private Integer endTimelong;
	private String orderName;//排序名称 如  价格，年代 
	private String orderMethod;//排序方式 如 asc desc 
	public Integer getPageNum() {
		return pageNum;
	}
	public void setPageNum(Integer pageNum) {
		this.pageNum = pageNum;
	}
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public String getEndTime() {
		return endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	public Double getStartPrice() {
		return startPrice;
	}
	public void setStartPrice(Double startPrice) {
		this.startPrice = startPrice;
	}
	public Double getEndPrice() {
		return endPrice;
	}
	public void setEndPrice(Double endPrice) {
		this.endPrice = endPrice;
	}
	public Integer getStartTimelong() {
		return startTimelong;
	}
	public void setStartTimelong(Integer startTimelong) {
		this.startTimelong = startTimelong;
	}
	public Integer getEndTimelong() {
		return endTimelong;
	}
	public void setEndTimelong(Integer endTimelong) {
		this.endTimelong = endTimelong;
	}
	public String getOrderName() {
		return orderName;
	}
	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}
	public String getOrderMethod() {
		return orderMethod;
	}
	public void setOrderMethod(String orderMethod) {
		this.orderMethod = orderMethod;
	}
	public MovieVO() {
		super();
	}
	
	
	
}
