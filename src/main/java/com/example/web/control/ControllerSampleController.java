package com.example.web.control;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ControllerSampleController {
	
	@ModelAttribute("csForm")
	public ControllerSampleForm setFrom()
	{
		return new ControllerSampleForm();
	}
	
	@RequestMapping("/controller-sample-input")
	public String input()
	{
		return "control/controllerSampleInput";
	}
	

	@RequestMapping(value="/controller-sample-result", method=RequestMethod.POST)
	public String postResult(@ModelAttribute("csForm") ControllerSampleForm form)
	{
		if(form.getName().equals(""))
		{
			form.setName("名無し");
		}
		return "control/controllerSampleResult";
	}

	@RequestMapping(value = "/controller-sample-result", method=RequestMethod.GET)
	public String getRequest(@RequestParam("msg") String msg, Model model)
	{
		model.addAttribute("msg", msg);
		return "/control/controllerSampleResult";
	}
}
