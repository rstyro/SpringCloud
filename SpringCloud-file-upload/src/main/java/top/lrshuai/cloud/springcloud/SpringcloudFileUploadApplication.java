package top.lrshuai.cloud.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringcloudFileUploadApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudFileUploadApplication.class, args);
    }

}
