package com.example.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute; 
import org.springframework.web.bind.annotation.RequestMapping; 

@Controller
public class ViewSample2Controller {
	
	@ModelAttribute
	public ViewSample2Form setForm()
	{
		return new ViewSample2Form();
	}
	
	@RequestMapping("/view-sample2-input")
	public String input()
	{
		return "ViewSample2Input";
	}
	
	@RequestMapping("/view-sample2-result")
	public String result(ViewSample2Form form)
	{
		return "ViewSample2Result";
	}
}
