package com.example.domain;

public class SearchProductInfo {
	
	private String searchProductNo;
	private String searchProductName;
	private Integer searchMaxPrice;
	private Integer searchMinPrice;
	
	public String getSearchProductNo()
	{
		return searchProductNo;
	}
	
	public void setSearchProductNo(String searchProductNo)
	{
		this.searchProductNo = searchProductNo;
	}
	
	public String getSearchProductName()
	{
		return searchProductName;
	}
	
	public void setSearchProductName(String searchProductName)
	{
		this.searchProductName = searchProductName;
	}
	
	public Integer getSearchMaxPrice()
	{
		return searchMaxPrice;
	}
	
	public void setSearchMaxPrice(Integer searchMaxPrice)
	{
		this.searchMaxPrice = searchMaxPrice;
	}
	
	public Integer getSearchMinPrice()
	{
		return searchMinPrice;
	}
	
	public void setSearchMinPrice(Integer searchMinPrice)
	{
		this.searchMinPrice = searchMinPrice;
	}
}