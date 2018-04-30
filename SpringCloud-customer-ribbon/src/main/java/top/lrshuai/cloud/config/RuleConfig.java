package top.lrshuai.cloud.config;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;

import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;

@Configurable
public class RuleConfig {
	@Bean
	public IRule ribbonRule(IClientConfig config) {
		return new RandomRule();
	}
	
}
