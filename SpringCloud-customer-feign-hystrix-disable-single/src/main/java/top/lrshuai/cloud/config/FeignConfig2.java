package top.lrshuai.cloud.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import feign.Feign;
import feign.auth.BasicAuthRequestInterceptor;

@Configuration
public class FeignConfig2 {
	
	/**
	 * eureka 如果设置了密码，需要此方法进行设置
	 * @return
	 */
	@Bean
	public BasicAuthRequestInterceptor basicAuthRequestInterceptor() {
		return new BasicAuthRequestInterceptor("rstyro", "rstyropwd");
	}
	
	/**
	 * 禁用 hystrix 支持：http://cloud.spring.io/spring-cloud-static/Dalston.SR5/single/spring-cloud.html#spring-cloud-feign-hystrix
	 * To disable Hystrix support on a per-client basis create a vanilla Feign.Builder with the "prototype" scope, e.g.:
	 * @return
	 */
	@Bean
	@Scope("prototype")
	public Feign.Builder feignBuilder() {
		return Feign.builder();
	}
}
