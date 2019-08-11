package top.lrshuai.cloud.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import top.lrshuai.cloud.springcloud.entity.Item;
import top.lrshuai.cloud.springcloud.feign.FeignClientService;

@RestController
public class TestController {

    @Autowired
    private FeignClientService feignClientService;

    @GetMapping("/provider/{id}")
    public Object test(@PathVariable String id) {
        return feignClientService.detai(id);
    }

    @GetMapping("/add")
    public Object test(Item item) {
        return feignClientService.add(item);
    }
}
