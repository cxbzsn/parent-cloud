package com.scsj.comm.conf;

import org.springframework.context.annotation.Configuration;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

/** 
 * @ClassName: SessionConfig 
 * @Description: Session的配置类。
 * @Configuration 自动配置
 * @EnableRedisHttpSession 设置session最大缓存时间
 * @author NanTian
 * @date 2018年5月4日 下午3:21:39 
*/
@Configuration
@EnableRedisHttpSession(maxInactiveIntervalInSeconds = 86400*30)
public class SessionConfig {
	
	

}
