package com.app.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.app.pojos.IProduct;

@Controller
public class Product {
	
	@Autowired
	private IProduct productRepo;
	
	public Product() {
		System.out.println("Product called here"+getClass().getName());
	}
	
	@GetMapping("/")
	public String productPage()
	{
		System.out.println("productPage here"+getClass().getName());
		return "index";
	}
	
	@GetMapping("/product")
	public ModelAndView fetchDetail(@RequestParam("pid")Integer pid)
	{
		System.out.println("fetch date here"+getClass().getName());
		
		ModelAndView mav = new ModelAndView();
		
		Optional<com.app.pojos.Product> product=productRepo.findById(pid);
		
		if(product.isPresent())
		{
			com.app.pojos.Product p = product.get();
			
			mav.addObject(p);
		}
		
		mav.setViewName("index");
		return mav;
	}

}
