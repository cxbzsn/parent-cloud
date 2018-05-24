package com.scsj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/** 
 * @ClassName:     ConfigClientApplication 
 * @Description:   ConfigClientApplication config配置中心
 * @author         caoxb
 * @date           2018年5月10日 下午2:29:12 
 * 
 * 	@SpringBootApplication springboot微服务
 * 	@EnableDiscoveryClient 将config服务注册到服务中心
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ConfigClientApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(ConfigClientApplication.class, args);
	}

}
