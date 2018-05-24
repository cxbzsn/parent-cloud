package com.scsj;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/** 
 * @ClassName: EurekaProviderApplication 
 * @Description: EurekaProviderApplication 服务提供者
 * @author caoxb
 * @date 2018年5月10日 下午2:29:12 
*/
@SpringBootApplication
@EnableDiscoveryClient
public class EurekaProviderApplication {
	
	public static void main(String[] args) {
        SpringApplication.run(EurekaProviderApplication.class, args);
    }
	
}
