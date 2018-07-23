package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
* Simple Demo Project
*
* @author Fasiuddin Mohammed
* 
*/


/**
* Simple Demo Class
*/
@RestController
public class HelloController {
	
	@GetMapping("/")
	public final String greetings(){
		return "Hello World - UPDATED!";
	}

}
