package com.example.domain;

public class ProductInfo {
	
	private int id;
	private String productNo;
	private String productName;
	private Integer price;
	
	public int getId()
	{
		return id;
	}
	
	public void setId(int id)
	{
		this.id = id;
	}
	
	public String getProductNo()
	{
		return productNo;
	}
	
	public void setProductNo(String productNo)
	{
		this.productNo = productNo;
	}
	
	public String getProductName()
	{
		return productName;
	}
	
	public void setProductName(String productName)
	{
		this.productName = productName;
	}
	
	public Integer getPrice()
	{
		return price;
	}
	
	public void setPrice(Integer price)
	{
		this.price = price;
	}
}
