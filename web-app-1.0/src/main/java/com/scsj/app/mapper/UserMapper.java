package com.scsj.app.mapper;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.scsj.app.entity.User;

/** 
 * @ClassName: UserMapper 
 * @Description: UserMapper sql处理类
 * @author NanTian
 * @date 2018年5月4日 下午2:29:12 
*/
public interface UserMapper extends JpaRepository{
	
	@Query(" SELECT * FROM user WHERE id = ?1 ")
	User findById(int id);
	

}
