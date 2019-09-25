package com.example.web.control;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ControllerMondaiController {

	@RequestMapping({"/controller-mondai-input", "/control/mondai-input"})
	public String input()
	{
		return "control/controllerMondaiInput";
	}
	
	@RequestMapping("/controller-mondai-result")
	public String result(@RequestParam("msg") String msg, Model model)
	{
		model.addAttribute("msg", msg);
		return "control/controllerMondaiResult";
	}
}
