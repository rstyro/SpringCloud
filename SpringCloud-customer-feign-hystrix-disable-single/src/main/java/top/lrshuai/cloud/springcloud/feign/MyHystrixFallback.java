package top.lrshuai.cloud.springcloud.feign;

import org.springframework.stereotype.Component;

import top.lrshuai.cloud.springcloud.entity.Item;

@Component
public class MyHystrixFallback implements FeignClientService {

    @Override
    public Object detai(String id) {
        return "detail fallback info";
    }

    @Override
    public Object add(Item item) {
        return "add fallback info";
    }


}
