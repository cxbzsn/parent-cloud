package com.scsj.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

@Controller
public class TestController {
	
	@Autowired
	RestTemplate template;
	
	@GetMapping("/test")
	public String test(@RequestParam String name) {
		
		return template.getForObject("http://EUREKA-CLIENT-PROVIDER/test?name="+name,String.class);
	}

}
