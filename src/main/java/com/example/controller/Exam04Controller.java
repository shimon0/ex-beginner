package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.form.UserForm;

@Controller
@RequestMapping("/exam04")
public class Exam04Controller {
	
	@ModelAttribute
	public UserForm setUpForm() {
		return new UserForm();
	}
	@RequestMapping("")
	public String index() {
		return "exam04";
	}
	@RequestMapping("/result")
	public String result(String name,String comment,Integer age,Model model) {
		System.out.println(name);
		model.addAttribute("name",name);
		model.addAttribute("age",age);
		model.addAttribute("comment",comment);
		return "exam04-result";
	}
}
