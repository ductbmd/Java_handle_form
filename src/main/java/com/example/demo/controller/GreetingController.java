package com.example.demo.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.model.Greeting;

@Controller
public class GreetingController {
	
	@GetMapping("/greeting")
	public String greetingForm(Model model) {
		model.addAttribute("greeting",new Greeting());
		return "greeting";
	}
	@PostMapping("greeting")
	public String greetingSubmit(@ModelAttribute Greeting greeting,HttpServletRequest request) {
		System.out.println(request.getParameter("id"));
		return "result";
	}
}
