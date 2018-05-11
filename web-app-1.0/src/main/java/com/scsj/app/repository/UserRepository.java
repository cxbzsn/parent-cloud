package com.scsj.app.repository;



import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.scsj.app.entity.User;

/** 
 * @ClassName: UserRepository 
 * @Description: user对象的持久层操作
 * @author caoxb
 * @date 2018年5月4日 下午2:29:12 
*/
@Repository
public interface UserRepository extends CrudRepository<User, Long>{
	
	@Modifying
	@Transactional
	@Query(" update User u set u.loginname='caoxb' where u.id = ?1 and u.name = ?2 ")
	int updateByIdAndName(Long id,String name);
	
	
	
	
	
}
