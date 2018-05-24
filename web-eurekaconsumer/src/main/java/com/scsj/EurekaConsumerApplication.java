package com.scsj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/** 
 * @ClassName: EurekaConsumerApplication 
 * @Description: EurekaConsumerApplication 消费者
 * @author caoxb
 * @date 2018年5月10日 下午2:29:12 
 * 
 * 	@SpringBootApplication springboot启动服务
 * 	@EnableDiscoveryClient 服务发现
 * 	@EnableCircuitBreaker 开启容错功能
 * 	@EnableFeignClients 远程服务调用
 * 
*/
@SpringBootApplication
@EnableDiscoveryClient
@EnableCircuitBreaker
@EnableFeignClients
public class EurekaConsumerApplication {
	
	public static void main(String[] args) {
        SpringApplication.run(EurekaConsumerApplication.class, args);
    }
	
	  //rabbion的负载均（使用feign  自带）
//	  @Bean
//    @LoadBalanced
//    RestTemplate restTemplate() {
//        return new RestTemplate();
//    }
	
	
}
