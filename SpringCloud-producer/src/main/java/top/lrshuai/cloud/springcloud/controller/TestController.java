package top.lrshuai.cloud.springcloud.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;

import top.lrshuai.cloud.springcloud.entity.Item;


@RestController
public class TestController {

    @Autowired
    private EurekaClient eurekaClient;


    @Autowired
    private DiscoveryClient discoveryClient;

    @GetMapping("/item/{id}")
    public Object test(@PathVariable("id") String id, HttpServletRequest request) {
        int port = request.getServerPort();
        System.out.println("item---id,port:" + port);
        return new Item(id, port + "");
    }

    @PostMapping("/add")
    public Object test(@RequestBody Item item) {
        return item;
    }


    @GetMapping("/vipAddress")
    public Object vipAddress() {
        InstanceInfo info = eurekaClient.getNextServerFromEureka("producer", false);
        return info.getHomePageUrl();
    }

    @SuppressWarnings("deprecation")
    @GetMapping("/service/info")
    public Object info() {
        ServiceInstance instance = discoveryClient.getLocalServiceInstance();
        return instance;
    }
}
