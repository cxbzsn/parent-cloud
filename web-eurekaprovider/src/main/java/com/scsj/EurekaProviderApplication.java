package com.scsj;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

/** 
 * @ClassName: EurekaProviderApplication 
 * @Description: EurekaProviderApplication 消费者
 * @author caoxb
 * @date 2018年5月10日 下午2:29:12 
*/
@SpringBootApplication
@EnableEurekaClient
public class EurekaProviderApplication {
	
	public static void main(String[] args) {
        SpringApplication.run(EurekaProviderApplication.class, args);
    }
	
	@Value("${server.port}")
    String port;
    @RequestMapping("/test")
    public String home(@RequestParam String name) {
        return "hi "+name+",i am from port:" +port;
    }

}
