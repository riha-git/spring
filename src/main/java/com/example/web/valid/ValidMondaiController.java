package com.example.web.valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ValidMondaiController {
	@ModelAttribute("vmForm")
	public ValidMondaiForm setFrom()
	{
		return new ValidMondaiForm();
	}
	
	@RequestMapping("/valid-mondai-input")
	public String input()
	{
		return "valid/validMondaiInput";
	}
	
	@RequestMapping("/valid-mondai-conf")
	public String conf(@Validated @ModelAttribute("vmForm") ValidMondaiForm form, BindingResult result)
	{
		if(result.hasErrors())
		{
			return "valid/validMondaiInput";
		}
		return "valid/validMondaiConf";
	}
}
