package com.scsj.app.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

/** 
 * @ClassName: User 
 * @Description: User 实体类
 * @author NanTian
 * @date 2018年5月4日 下午2:21:39 
*/
@Entity
@Data
@Table(name = "user")
public class User implements Serializable{
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String loginname;
	private String password;
	private Date birthday;
	
	//构造函数
	public User() {
		super();
	}

	public User(Long id, String name, String loginName, String password, Date birthday) {
		super();
		this.id = id;
		this.name = name;
		this.loginname = loginName;
		this.password = password;
		this.birthday = birthday;
	}

	
	
	

}
