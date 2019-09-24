package com.example.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute; 
import org.springframework.web.bind.annotation.RequestMapping; 

@Controller
public class ViewMondaiController {
	
	@ModelAttribute
	public ViewMondaiForm setForm()
	{
		return new ViewMondaiForm();
	}
	
	@RequestMapping("/view-mondai-input")
	public String input()
	{
		return "ViewMondaiInput";
	}
	
	@RequestMapping("/view-mondai-result")
	public String result(ViewMondaiForm form)
	{
		return "ViewMondaiResult";
	}
}
