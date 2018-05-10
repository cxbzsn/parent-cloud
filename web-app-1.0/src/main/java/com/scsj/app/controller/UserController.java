package com.scsj.app.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.scsj.app.repository.UserRepository;
import com.scsj.app.service.UserService;

/** 
 * @ClassName: UserController 
 * @Description: UserController 用户控制层
 * @author caoxb
 * @date 2018年5月4日 下午2:29:12 
*/
@Controller
@RequestMapping("/user")
public class UserController {
	
	//自动注入
	@Autowired
	private UserService userService;
	@Autowired
	private UserRepository userRepository;
	
	
	

}
