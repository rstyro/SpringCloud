package top.lrshuai.cloud.springcloud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/item/{info}")
    public Object test(@PathVariable("info") String info) {
        return "zuul+" + info;
    }
}
