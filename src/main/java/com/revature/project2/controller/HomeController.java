package com.revature.project2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@RequestMapping("/home")
	public ModelAndView home() {
		ModelAndView view = new ModelAndView();
		view.setViewName("Home");
		return view;
	}
}
