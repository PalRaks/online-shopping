package com.pall.onlineshopping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.pall.shoppingbackend.dao.CategoryDAO;
import com.pall.shoppingbackend.dto.Category;


@Controller
public class PageController {

	@Autowired
	private CategoryDAO categoryDAO;
	
	@RequestMapping(value={"/","/home","/index"})
	public ModelAndView index()
	{
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title","Home");
		mv.addObject("clickHome",true);
		mv.addObject("categories",categoryDAO.list());
		
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

	/*Methods to load all the product based on category*/
	@RequestMapping(value="/show/all/products")
	public ModelAndView showAllProducts()
	{
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title","All products");
		mv.addObject("categories",categoryDAO.list());
		mv.addObject("clickAllProducts",true);
		return mv;
	}
	
	@RequestMapping(value="/show/category/{id}/products")
	public ModelAndView showCategoryProducts(@PathVariable("id") int id)
	{
		ModelAndView mv = new ModelAndView("page");
		
		//CategoryDAO to fetch a single category
		
		Category category= null;
		category= categoryDAO.get(id);
		mv.addObject("title",category.getName());
		//Passing the list of categories
		mv.addObject("categories",categoryDAO.list());
		//Passing the single category object
		mv.addObject("category",category);
		mv.addObject("clickCategoryProducts",true);
		return mv;
	}
}
