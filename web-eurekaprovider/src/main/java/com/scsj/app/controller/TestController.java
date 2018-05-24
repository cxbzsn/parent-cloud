package com.scsj.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/** 
 * @ClassName:   controller  
 * @Description: TestController 服务提供处理类
 * @author       caoxb
 * @date         2018年5月14日 下午2:29:12 
*/
@Controller
public class TestController {
	
	//提供服务端口号
	@Value("${server.port}")
    String port;
    @GetMapping("/test")
    @ResponseBody
    public String home(@RequestParam String name) {
    	
        return "hi: "+name+",i am from port:" +port;
    }
    
}
