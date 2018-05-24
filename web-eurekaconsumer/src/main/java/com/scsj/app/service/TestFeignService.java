package com.scsj.app.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.scsj.app.service.impl.TestHystrixServiceImpl;

/** 
 * @ClassName:   interface  
 * @Description: TestFeignService 服务提供接口
 * @author       caoxb
 * @date         2018年5月14日 下午2:29:12 
 * @FeignClient  指定远程调用接口名
*/
@FeignClient(value = "eureka-client-provider",fallback = TestHystrixServiceImpl.class)
public interface TestFeignService {
	
	//远程接口调用+容错测试
	@GetMapping(value = "/test")
	public String getFeignName(@RequestParam("name") String name);

}
