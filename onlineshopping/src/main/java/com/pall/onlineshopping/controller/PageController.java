package com.pall.onlineshopping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class PageController {

	@RequestMapping(value={"/","/home","/index"})
	public ModelAndView index()
	{
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title","Home");
		mv.addObject("clickHome",true);
		return mv;
	}
	
	@RequestMapping(value="/contact")
	public ModelAndView contact()
	{
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title","Contact Us");
		mv.addObject("clickContact",true);
		return mv;
	}
	@RequestMapping(value="/about")
	public ModelAndView about()
	{
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title","About Us");
		mv.addObject("clickAbout",true);
		return mv;
	}

	/*@RequestMapping(value={"/test"})
	public ModelAndView test(@RequestParam(value="greet",required=false) String greet)
	{
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("greetings",greet);
	
		return mv;
	}
	@RequestMapping(value={"/test/{greet}"})
	public ModelAndView test(@PathVariable(value="greet") String greet)
	{
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("greetings",greet);
	
		return mv;
	}*/
}
