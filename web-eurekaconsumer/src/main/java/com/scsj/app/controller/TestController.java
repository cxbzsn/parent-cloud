package com.scsj.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.scsj.app.service.TestFeignService;

/** 
 * @ClassName:   controller  
 * @Description: TestController 服务消费处理类
 * @author       caoxb
 * @date         2018年5月14日 下午2:29:12 
*/
@Controller
public class TestController {
	
	@Autowired
	private TestFeignService feignService;
	
	@GetMapping("/test")
	@ResponseBody
	@HystrixCommand(fallbackMethod = "error")
	public String getFeignName(@RequestParam("name") String name) {
		
		return feignService.getFeignName(name);
	}
	
	public String error(String name) {
		return "出错了: " + name;
	}
	
	
	
	
	
	
	
	
	

}
