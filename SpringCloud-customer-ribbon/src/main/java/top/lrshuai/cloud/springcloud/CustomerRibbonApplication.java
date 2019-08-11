package top.lrshuai.cloud.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import top.lrshuai.cloud.config.RuleConfig;

@Configuration
@RibbonClient(name = "producer2", configuration = RuleConfig.class)
@SpringBootApplication
@EnableEurekaClient
public class CustomerRibbonApplication {

    public static void main(String[] args) {
        SpringApplication.run(CustomerRibbonApplication.class, args);
    }

    @Bean
    @LoadBalanced
    public RestTemplate restTemlate() {
        return new RestTemplate();
    }
}
