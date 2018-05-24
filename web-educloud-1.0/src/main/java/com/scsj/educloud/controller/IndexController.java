package com.scsj.educloud.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/** 
 * @ClassName:     IndexController 
 * @Description:   IndexController 用户控制层
 * @author         caoxb
 * @date 		   2018年5月4日 下午2:29:12 
 */
@Controller
public class IndexController {
	
	/**
	 * @description	首页详情页
	 * @author      caoxb
	 * @date        2018-04-27 10:20
	 * @return  	index.html
	 */
	@GetMapping("/index")
	public String index() {
		
		return "index";
	}
	

}
