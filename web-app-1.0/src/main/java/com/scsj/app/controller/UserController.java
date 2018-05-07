package com.scsj.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.scsj.app.entity.User;
import com.scsj.app.service.UserService;

/** 
 * @ClassName: UserController 
 * @Description: UserController 用户控制层
 * @author caoxb
 * @date 2018年5月4日 下午2:29:12 
*/
@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value = "/getUser", method = RequestMethod.GET)
	public void getUser() {
		
		User user = userService.getUserById(1);
		System.out.println(user.getLoginName());
		for (int i = 0; i < 5; i++) {
			System.out.println("test");
		}
		
	}

}
