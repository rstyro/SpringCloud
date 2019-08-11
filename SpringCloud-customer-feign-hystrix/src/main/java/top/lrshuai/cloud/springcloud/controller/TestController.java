package top.lrshuai.cloud.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import top.lrshuai.cloud.springcloud.feign.MyFeignClient;
import top.lrshuai.cloud.springcloud.feign.MyFeignClient2;

@RestController
public class TestController {

    @Autowired
    private MyFeignClient feignClientService;

    @Autowired
    private MyFeignClient2 myfeignClent2;

    @GetMapping("/provider/{id}")
    public Object test(@PathVariable String id) {
        return feignClientService.detai(id);
    }

    @GetMapping("/search/{id}")
    public Object search(@PathVariable String id) {
        return myfeignClent2.search(id);
    }
}
