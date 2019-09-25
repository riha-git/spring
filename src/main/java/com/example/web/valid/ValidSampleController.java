package com.example.web.valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ValidSampleController {
	
	@ModelAttribute("csForm")
	public ValidSampleForm setForm()
	{
		return new ValidSampleForm();
	}
	
	@RequestMapping("/valid-sample-input")
	public String input()
	{
		return "valid/validSampleInput";
	}

	@RequestMapping("/valid-sample-conf")
	public String conf(@Validated @ModelAttribute("csForm") ValidSampleForm form, BindingResult result)
	{
		if(!form.getMail().equals(form.getMailConf()))
		{
			result.rejectValue("mailConf", "errors.invalid.mail");
		}

		if(result.hasErrors())
		{
			return "valid/validSampleInput";
		}

		return "valid/validSampleConf";
	}
}
