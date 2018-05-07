package com.scsj.app.entity;

import java.io.Serializable;
import java.util.Date;

/** 
 * @ClassName: User 
 * @Description: User 实体类
 * @author NanTian
 * @date 2018年5月4日 下午2:21:39 
*/
public class User implements Serializable{
	
	private int id;
	private String name;
	private String loginName;
	private String password;
	private Date birthday;
	
	//构造函数
	public User() {
		super();
	}
	public User(int id, String name, String loginName, String password, Date birthday) {
		super();
		this.id = id;
		this.name = name;
		this.loginName = loginName;
		this.password = password;
		this.birthday = birthday;
	}
	
	// geter seter 
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLoginName() {
		return loginName;
	}
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	
	
	
	
	
	

}
