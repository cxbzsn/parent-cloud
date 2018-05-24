package com.scsj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

/** 
 * @ClassName:     ConfigServerApplication 
 * @Description:   ConfigServerApplication config配置中心
 * @author         caoxb
 * @date           2018年5月10日 下午2:29:12 
 * 
 * 	@SpringBootApplication springboot微服务
 * 	@EnableConfigServer config服务端配置
 * 	@EnableDiscoveryClient 注册到服务中心
 */ 
@SpringBootApplication
@EnableConfigServer
public class ConfigServerApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(ConfigServerApplication.class, args);
	}

}
