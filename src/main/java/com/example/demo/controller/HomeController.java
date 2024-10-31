package com.example.demo.controller;

import org.springframework.stereotype.Controller; 
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.GetMapping; 
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.model.Greeting;

@Controller 
public class HomeController { 

	@GetMapping("/") 
	public String home() { 
		return "home";  // for home.html 
	} 

	@GetMapping("/greeting")
		public String greetingForm(Model model) {
			model.addAttribute("greeting", new Greeting());
			return "greeting";
	}

	  @PostMapping("/greeting")
 		 public String greetingSubmit(@ModelAttribute Greeting greeting, Model model) {
    		model.addAttribute("greeting", greeting);
    	return "result";
  	}
}