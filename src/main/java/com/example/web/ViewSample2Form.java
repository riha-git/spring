package com.example.web;

public class ViewSample2Form {
	
	private String name;
	private Integer age;
	private String[] goCountry;
	private String liveCountry;
	
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
	
	public void setGoCountry(String[] goCountry)
	{
		this.goCountry = goCountry;
	}
	
	public String[] getGoCountry()
	{
		return goCountry;
	}
	
	public void setLiveCountry(String liveCountry)
	{
		this.liveCountry = liveCountry;
	}
	
	public String getLiveCountry()
	{
		return liveCountry;
	}
}
