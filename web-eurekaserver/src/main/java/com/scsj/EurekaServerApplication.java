package com.scsj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/** 
 * @ClassName: EurekaServerApplication 
 * @Description: EurekaServerApplication EurekaServer服务注册中心
 * @author caoxb
 * @date 2018年5月10日 下午2:29:12 
 * 
 * 	@SpringBootApplication springboot微服务
 * 	@EnableEurekaServer 服务注册中心
*/
@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApplication {
	
	public static void main(String[] args) {
        SpringApplication.run(EurekaServerApplication.class, args);
    }
	
	

}
