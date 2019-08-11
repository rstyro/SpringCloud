package top.lrshuai.cloud.springcloud.feign;


import org.springframework.cloud.netflix.feign.FeignClient;

import feign.Param;
import feign.RequestLine;
import top.lrshuai.cloud.config.FeignConfig;
import top.lrshuai.cloud.springcloud.entity.Item;

@FeignClient(name = "producer", configuration = FeignConfig.class, fallback = MyHystrixFallback.class)
public interface FeignClientService {

    //https://github.com/OpenFeign/feign 有例子
    @RequestLine("GET /item/{id}")
    public Object detai(@Param("id") String id);


    @RequestLine("POST /add")
    public Object add(Item item);
}
