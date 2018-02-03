package com.test.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@Autowired
	private Environment environment;	//方式一：全部注入
	
	@Autowired
	@Value("${name}")
	private String name;
	@Value("${url}")
	private String url;
	
	@GetMapping("/hello")
	public String hello(){
		System.out.println(environment.getProperty("name"));
		System.out.println(environment.getProperty("url"));
		System.out.println(name);
		System.out.println(url);	
		return "Hello World!";
	}
}
