package com.scsj.educloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/** 
 * @ClassName:     EduCloudRunApplication 
 * @Description:   EduCloudRunApplication 项目启动类
 * @author         caoxb
 * @date           2018年5月15日 上午10:29:12 
*/
@SpringBootApplication
@EnableEurekaClient
public class EduCloudRunApplication {
	
	public static void main(String[] args) {
        SpringApplication.run(EduCloudRunApplication.class, args);
    }

}
