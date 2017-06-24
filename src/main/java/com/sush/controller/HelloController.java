package com.sush.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/welcome")
public class HelloController {


	@RequestMapping("/hello")
	protected ModelAndView helloWorld(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		ModelAndView modelAndView=new ModelAndView("HelloPage");
		modelAndView.addObject("msg","Hello user, welcome to the 2nd spring project");
		return modelAndView;
	}

	@RequestMapping("/hi")
	protected ModelAndView hiWorld(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		ModelAndView modelAndView=new ModelAndView("HelloPage");
		modelAndView.addObject("msg","Hi user, welcome to the 2nd spring project");
		return modelAndView;
	}
}
