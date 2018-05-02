package top.lrshuai.cloud.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import feign.Contract;
import feign.Logger;

@Configuration
public class FeignConfig {
	@Bean
	public Contract feignContract() {
		return new feign.Contract.Default();
	}
	

	/**
	 * 加日志的
	 * http://cloud.spring.io/spring-cloud-static/Dalston.SR5/single/spring-cloud.html#_feign_logging
	 * @return
	 */
	@Bean
    Logger.Level feignLoggerLevel() {
        return Logger.Level.FULL;
    }

//	@Bean
//	public BasicAuthRequestInterceptor basicAuthRequestInterceptor() {
//		return new BasicAuthRequestInterceptor("rstyro", "rstyropwd");
//	}
}
