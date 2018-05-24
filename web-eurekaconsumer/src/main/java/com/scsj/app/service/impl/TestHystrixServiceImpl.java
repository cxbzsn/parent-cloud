package com.scsj.app.service.impl;

import org.springframework.stereotype.Service;
import com.scsj.app.service.TestFeignService;

@Service
public class TestHystrixServiceImpl implements TestFeignService {

	@Override
	public String getFeignName(String name) {
		// TODO Auto-generated method stub
		return "获取name: " + name + "失败";
	}
}
