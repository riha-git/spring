package com.example.web.valid;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.Range;

public class ValidSampleForm {
	
	@NotEmpty
	private String name;
	@NotNull
	@Range(min=1, max=120, message="{0}は{min}から{max}までの値")
	private String age;
	@NotEmpty
	@Email(message="メールアドレス形式不正")
	private String mail;
	@NotEmpty
	private String mailConf;
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setAge(String age)
	{
		this.age = age;
	}
	
	public String getAge()
	{
		return age;
	}
	
	public void setMail(String mail)
	{
		this.mail = mail;
	}
	
	public String getMail()
	{
		return mail;
	}
	
	public void setMailConf(String mailConf)
	{
		this.mailConf = mailConf;
	}
	
	public String getMailConf()
	{
		return mailConf;
	}
}
