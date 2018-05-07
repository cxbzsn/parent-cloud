package com.scsj.app.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 基础处理类
 * @author caoxb
 * @date 2018-04-27 10:20
 *
 */
@Controller
public class ZsnController {
	
	/**
	 * 首页详情页
	 * @author caoxb
	 * @date 2018-04-27 10:20
	 * @return index.html
	 */
	@RequestMapping("/index")
	public String index() {
		
		return "web/index";
	}
	
	/**
	 * 设计师
	 * @author caoxb
	 * @date 2018-04-27 10:20
	 * @return artist.html
	 */
	@RequestMapping("/artist")
	public String artist() {
		
		return "web/artist";
	}
	
	/**
	 * 最近更新
	 * @author caoxb
	 * @date 2018-04-27 10:20
	 * @return news.html
	 */
	@RequestMapping("/news")
	public String news() {
		
		return "web/news";
	}
	
	/**
	 * 设计作品
	 * @author caoxb
	 * @date 2018-04-27 10:20
	 * @return works.html
	 */
	@RequestMapping("/works")
	public String works() {
		
		return "web/works";
	}
	
	/**
	 * 合作伙伴
	 * @author caoxb
	 * @date 2018-04-27 10:20
	 * @return about_us.html
	 */
	@RequestMapping("/partners")
	public String partners() {
		
		return "web/partners";
	}
	
	/**
	 * 关于我们
	 * @author caoxb
	 * @date 2018-04-27 10:20
	 * @return about_us.html
	 */
	@RequestMapping("/about_us")
	public String about_us() {
		
		return "web/about_us";
	}
	
	/**
	 * 联系
	 * @author caoxb
	 * @date 2018-04-27 10:20
	 * @return contact.html
	 */
	@RequestMapping("/contact")
	public String contact() {
		
		return "web/contact";
	}
	
	
	
	

}
