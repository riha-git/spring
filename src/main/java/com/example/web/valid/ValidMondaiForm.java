package com.example.web.valid;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

public class ValidMondaiForm {
	
	@NotEmpty
	private String companyName;
	@NotEmpty
	@Pattern(regexp="http(s)?://([\\w-]+\\.)+[\\w-]+(/[\\w- ./?%&=]*)?", message="URL不正")
	private String companyURL;
	@NotNull
	private Double level;
	
	public void setCompanyName(String companyName)
	{
		this.companyName = companyName;
	}
	
	public String getCompanyName()
	{
		return companyName;
	}
	
	public void setCompanyURL(String companyURL)
	{
		this.companyURL = companyURL;
	}
	
	public String getCompanyURL()
	{
		return companyURL;
	}
	
	public void setLevel(Double level)
	{
		this.level = level;
	}
	
	public Double getLevel()
	{
		return level;
	}
}
