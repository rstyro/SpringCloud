package top.lrshuai.cloud.springcloud.feign;

import org.springframework.stereotype.Component;

@Component
public class MyHystrixFallback implements MyFeignClient {

    @Override
    public Object detai(String id) {
        return "自定义Hystrix 返回数据：id=" + id;
    }

}
