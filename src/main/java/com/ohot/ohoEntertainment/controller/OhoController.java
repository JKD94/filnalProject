package com.ohot.ohoEntertainment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ohot.ohoEntertainment.service.HomeService;


@CrossOrigin("*")
@RestController
@RequestMapping("/ohoEntertainment")
public class OhoController {
	
	@Autowired
	HomeService homeService;
	
	@GetMapping("/home")
	public String home() {
		String result = "들어왔니?";
		
		return result;
	}
	
}
