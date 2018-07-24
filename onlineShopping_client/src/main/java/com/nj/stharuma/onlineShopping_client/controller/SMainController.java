package com.nj.stharuma.onlineShopping_client.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SMainController {
	@RequestMapping(value= {"/", "/home", "/index"})
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView("main");
		mv.addObject("greeting",  "Welcome to Spring MVC");
		return mv;
	}

}
