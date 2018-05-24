package com.scsj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/** 
 * @ClassName: EurekaServerApplication 
 * @Description: EurekaServerApplication EurekaServer服务注册中心
 * @author caoxb
 * @date 2018年5月10日 下午2:29:12 
 * 
 * 	@SpringBootApplication springboot微服务
 * 	@EnableDiscoveryClient 服务发现
 * 	@EnableZuulProxy zuul代理
*/
@SpringBootApplication
@EnableDiscoveryClient
@EnableZuulProxy
public class ZuulServiceApplication {
	
	public static void main(String[] args) {
        SpringApplication.run(ZuulServiceApplication.class, args);
    }

}
