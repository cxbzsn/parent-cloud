package com.scsj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/** 
 * @ClassName: EurekaConsumerApplication 
 * @Description: EurekaConsumerApplication 消费者
 * @author caoxb
 * @date 2018年5月10日 下午2:29:12 
*/
@SpringBootApplication
@EnableEurekaClient
public class EurekaConsumerApplication {
	
	public static void main(String[] args) {
        SpringApplication.run(EurekaConsumerApplication.class, args);
    }
	
	//开启负载均衡
	@Bean
    @LoadBalanced
    RestTemplate restTemplate() {
        return new RestTemplate();
    }
	
	

}
