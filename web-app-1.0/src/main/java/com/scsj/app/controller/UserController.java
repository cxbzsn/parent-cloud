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
	
	/**
	 * 主键查询
	 */
	@RequestMapping(value = "/findById", method = RequestMethod.GET)
	public void findById() {
		
		int id = 1;
		User user = userService.findUserById(id);
		System.out.println(user.getLoginName());
		for (int i = 0; i < 5; i++) {
			System.out.println("test");
		}
		
	}
	/**
	 * 单一删除
	 */
	@RequestMapping(value = "/delete",method = RequestMethod.GET)
	public void deleteUserById() {
		
		int id = 2;
		int i = userService.deleteUserById(id);
		System.out.println(i);
		
	}
	
	
	
	
	

}
