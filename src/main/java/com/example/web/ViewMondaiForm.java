package com.example.web;

public class ViewMondaiForm {
	
	private String name;
	private Integer age;
	private String experience;
	private String[] goCountry;
	
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
	
	public void setExperience(String experience)
	{
		this.experience = experience;
	}
	
	public String getExperience()
	{
		return experience;
	}
}
