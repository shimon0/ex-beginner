package com.example.controller;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/exam03")
public class Exam03Controller {
	
	@Autowired
	private ServletContext application;
	
	@RequestMapping("")
	public String input() {
		return "exam03";
	}
	@RequestMapping("/result")
	public String result(Integer product1,Integer product2,Integer product3) {
		int sum=product1+product2+product3;
		application.setAttribute("sum",sum);
		application.setAttribute("sumInTax", (int)(sum*1.1));
		return "exam03-result";
	}
}
