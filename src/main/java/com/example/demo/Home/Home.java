package com.example.demo.Home;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class Home {

	
	@GetMapping("/")
	public String home() {
		return "home";
	}

	@GetMapping("/utilizator")
	public String utilizator() {
		return "utilizator";
	}
	
	@GetMapping("/admin")
	public String admin() {
		return "admin";
	}
}

