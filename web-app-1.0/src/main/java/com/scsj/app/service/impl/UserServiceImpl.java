package com.scsj.app.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.scsj.app.entity.User;
import com.scsj.app.repository.UserRepository;
import com.scsj.app.service.UserService;

/** 
 * @ClassName: UserServiceImpl 
 * @Description: UserServiceImpl 业务处理实现类
 * @author NanTian
 * @date 2018年5月4日 下午2:29:12 
*/
@Service("userService")
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public User findUserById(int id) {
		// TODO Auto-generated method stub
		return userRepository.findUserById(id);
	}
		
	@Override
	public int deleteUserById(int id) {
		// TODO Auto-generated method stub
		return userRepository.deleteUserById(id);
	}
	
	
	

}
