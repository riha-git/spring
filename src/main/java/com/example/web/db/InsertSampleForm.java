package com.example.web.db;

import java.io.Serializable;

import javax.validation.constraints.NotEmpty;

public class InsertSampleForm {

	// serialVersionUIDを指定
	private static final long serialVersionUID = 1L;
	
	@NotEmpty
	private String productNo;
	@NotEmpty
	private String productName;
	private Integer price;
	
	public void setProductNo(String productNo)
	{
		this.productNo = productNo;
	}
	
	public String getProductNo()
	{
		return productNo;
	}
	
	public void setProductName(String productName)
	{
		this.productName = productName;
	}
	
	public String getProductName()
	{
		return productName;
	}
	
	public void setPrice(Integer price)
	{
		this.price = price;
	}
	
	public Integer getPrice()
	{
		return price;
	}
}
