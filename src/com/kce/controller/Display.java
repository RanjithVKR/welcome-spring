package com.kce.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.kce.model.Customer;

@ Controller
public class Display {
	@RequestMapping(value="/",method=RequestMethod.GET)
	public String start()
	{
		return "form";
	}
	@RequestMapping(value="add",method=RequestMethod.GET)
	public String form(@ModelAttribute Customer customer,ModelMap model)
	{
		model.addAttribute("id",customer.getCustid());
		model.addAttribute("name",customer.getCustName());
		model.addAttribute("address",customer.getAddress());
		return "welcome";
	}
}
