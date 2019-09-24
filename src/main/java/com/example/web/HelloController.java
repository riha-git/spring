package com.example.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

	@ModelAttribute
	public HelloPrintForm setForm()
	{
		return new HelloPrintForm();
	}
	
	@RequestMapping("/hello")
	public String hell()
	{
		return "hello";
	}
	
	@RequestMapping("/helloprint")
	public String helloPrint(HelloPrintForm form)
	{
		return "helloPrint";
	}
}
