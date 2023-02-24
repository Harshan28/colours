package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class colours {
	@GetMapping("/color")
	public String getcolor() {
		String name="Red";
		return "MY favourite colour is" +name+"!";
	}
	

}
