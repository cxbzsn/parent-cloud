package com.scsj.app.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {
	
	@Value("${foo}")
	String foo;
	
	@GetMapping("/getConfig")
	@ResponseBody
	public String GetConfig() {
		return foo;
	}
	

}
