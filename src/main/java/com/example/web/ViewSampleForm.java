package com.example.web;

public class ViewSampleForm {
	
	private String name;
	private Integer age;
	private boolean country;
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public String getName()
	{
		return name;
	}

	public void setAge(Integer age)
	{
		this.age = age;
	}
	
	public Integer getAge()
	{
		return age;
	}
	
	public void setCountry(boolean country)
	{
		this.country = country;
	}
	
	public boolean getCountry()
	{
		return country;
	}
}
