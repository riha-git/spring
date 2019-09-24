package com.example.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute; 
import org.springframework.web.bind.annotation.RequestMapping; 

@Controller
public class ViewSampleController {
	
	@ModelAttribute
	public ViewSampleForm setForm()
	{
		return new ViewSampleForm();
	}
	
	@RequestMapping("/view-sample-input")
	public String input()
	{
		return "ViewSampleInput";
	}
	
	@RequestMapping("/view-sample-result")
	public String result(ViewSampleForm form)
	{
		return "ViewSampleResult";
	}
}
