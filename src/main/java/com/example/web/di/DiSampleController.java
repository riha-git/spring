package com.example.web.di;

import com.example.service.DiSampleService;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;

@Controller
public class DiSampleController {
	
	@Autowired
	private DiSampleService diService;
	
	@ModelAttribute("diForm")
	public DiSampleForm setForm()
	{
		return new DiSampleForm();
	}

	@RequestMapping("/di-sample-input")
	public String input()
	{
		return "di/diSampleInput";
	}
	
	@RequestMapping("/di-sample-result")
	public String result(@ModelAttribute("diForm") DiSampleForm form, Model model)
	{
		String msg = diService.getDateMessage(form.getMonth(), form.getDay());
		model.addAttribute("dateMessage", msg);
		return "di/diSampleResult";
	}
}