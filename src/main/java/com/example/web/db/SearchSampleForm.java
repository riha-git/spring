package com.example.web.db;

public class SearchSampleForm {

	private String searchProductNo;
	private String searchProductName;
	private Integer searchMinPrice;
	private Integer searchMaxPrice;
	
	public void setSearchProductNo(String searchProductNo)
	{
		this.searchProductNo = searchProductNo;
	}
	
	public String getSearchProductNo()
	{
		return searchProductNo;
	}
	
	public void setSearchProductName(String searchProductName)
	{
		this.searchProductName = searchProductName;
	}
	
	public String getSearchProductName()
	{
		return searchProductName;
	}
	
	public void setSearchMinPrice(Integer searchMinPrice)
	{
		this.searchMinPrice = searchMinPrice;
	}
	
	public Integer getSearchMinPrice()
	{
		return searchMinPrice;
	}
	
	public void setSearchMaxPrice(Integer searchMaxPrice)
	{
		this.searchMaxPrice = searchMaxPrice;
	}
	
	public Integer getSearchMaxPrice()
	{
		return searchMaxPrice;
	}
}