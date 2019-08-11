package top.lrshuai.cloud.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import top.lrshuai.cloud.springcloud.filter.MyPreZuulFileter;

@SpringBootApplication
@EnableZuulProxy
public class SpringcloudZuulFilterApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudZuulFilterApplication.class, args);
    }

    @Bean
    public MyPreZuulFileter myPreZuulFileter() {
        return new MyPreZuulFileter();
    }

}
