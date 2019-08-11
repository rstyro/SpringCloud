package top.lrshuai.cloud.springcloud.feign;

import org.springframework.stereotype.Component;

@Component
public class MyHystrixFallback2 implements FeignClientService2 {

    @Override
    public Object serverInfo(String serviceName) {
        return "serverinfo  fallback info";
    }


}
