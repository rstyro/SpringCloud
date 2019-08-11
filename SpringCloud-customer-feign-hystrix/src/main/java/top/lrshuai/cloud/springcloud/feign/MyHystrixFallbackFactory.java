package top.lrshuai.cloud.springcloud.feign;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import feign.hystrix.FallbackFactory;

@Component
public class MyHystrixFallbackFactory implements FallbackFactory<MyFeignClient2> {
    private static final Logger log = LoggerFactory.getLogger(MyHystrixFallbackFactory.class);

    @Override
    public MyFeignClient2 create(Throwable e) {
        log.info("throwable = " + e);
        return new MyHystrixFeignClient2Fallback();
    }


}
