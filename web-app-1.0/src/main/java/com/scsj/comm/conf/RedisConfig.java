package com.scsj.comm.conf;

import org.springframework.cache.annotation.CachingConfigurerSupport;
import org.springframework.cache.annotation.EnableCaching; 
import org.springframework.context.annotation.Bean; 
import org.springframework.context.annotation.Configuration; 
import org.springframework.data.redis.cache.RedisCacheManager; 
import org.springframework.data.redis.connection.RedisConnectionFactory; 
import org.springframework.data.redis.core.RedisTemplate; 
import org.springframework.data.redis.core.StringRedisTemplate; 

/** 
 * @ClassName: RedisConfig 
 * @Description: Redis的配置类。
 * @Configuration 自动配置
 * @EnableCaching 开启缓存
 * @author NanTian
 * @date 2018年5月4日 下午5:21:39 
*/
@Configuration
@EnableCaching
public class RedisConfig extends CachingConfigurerSupport{ 
	
	// redisTemplate
	@Bean
	public RedisTemplate<String, Object> redisTemplate(RedisConnectionFactory factory) {
		
		RedisTemplate<String, Object> redisTemplate = new RedisTemplate<String, Object>(); 
	    redisTemplate.setConnectionFactory(factory); 
		return redisTemplate; 
		  
	} 
	// stringRedisTemplate
	@Bean
	public StringRedisTemplate stringRedisTemplate(RedisConnectionFactory factory) {
		  
		StringRedisTemplate stringRedisTemplate = new StringRedisTemplate(); 
		stringRedisTemplate.setConnectionFactory(factory); 
		return stringRedisTemplate; 
		  
	}
  
}
