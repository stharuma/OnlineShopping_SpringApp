package com.nj.stharuma.onlineShopping_client.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SMainController {
	@RequestMapping(value = { "/", "/home", "/index" })
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView("main");
		mv.addObject("greeting", "Welcome to Spring MVC");
		return mv;
	}

	@RequestMapping(value = "/test")
	// public ModelAndView test(@RequestParam("test") String greeting ) {
	public ModelAndView test(@RequestParam(value="test", required=false) String greeting) {
		if(greeting==null) {
			greeting ="Hello There";
		}
		ModelAndView mv = new ModelAndView("main");
		mv.addObject("greeting", greeting);
		return mv;
	}
	
	@RequestMapping(value = "/testPV/{test}")
	// public ModelAndView testPathVariable(@PathVariable("test") String greeting ) {
	public ModelAndView testPathVariable(@PathVariable("test") String greeting) {
		if(greeting==null) {
			greeting ="Hello There";
		}
		ModelAndView mv = new ModelAndView("main");
		mv.addObject("greeting", greeting);
		return mv;
	}


}
