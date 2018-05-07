package com.scsj.app.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.scsj.app.entity.User;

/** 
 * @ClassName: UserMapper 
 * @Description: UserMapper sql处理类
 * @author NanTian
 * @date 2018年5月4日 下午2:29:12 
*/
public interface UserRepository extends JpaRepository<User, Long>{
	
	@Query(" SELECT * FROM user WHERE id = ?1 ")
	User findUserById(int id);
	
	@Modifying
	@Transactional
	@Query(" DELETE FROM user WHERE id = ?1 ")
	int deleteUserById(int id);
	

}
