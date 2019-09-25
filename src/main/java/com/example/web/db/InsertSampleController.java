package com.example.web.db;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class InsertSampleController {
	
	@ModelAttribute("insertForm")
	public InsertSampleForm setForm()
	{
		return new InsertSampleForm();
	}
	
	@RequestMapping("/insert-sample-input")
	public String input()
	{
		return "db/insertSampleInput";
	}
	
	@RequestMapping("/insert-sample-conf")
	public String conf(@ModelAttribute("insertFrom") InsertSampleForm form)
	{
		return "db/insertSampleConf";
	}
	
	@RequestMapping(value = "/insert-sample-end", params = "back_btn")
	public String back(@ModelAttribute("insertForm") InsertSampleForm form)
	{
		return "db/insertSampleInput";
	}
	
	@RequestMapping(value = "/insert-sample-end", params = "insert_btn")
	public String end()
	{
		return "db/insertSampleEnd";
	}
}
