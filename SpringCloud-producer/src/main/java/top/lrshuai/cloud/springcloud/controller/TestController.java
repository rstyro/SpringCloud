package top.lrshuai.cloud.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
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
	public Object test(@PathVariable("id")String id) {
		return new Item(id);
	}
	
	@PostMapping("/add")
	public Object test(@RequestBody Item item) {
		return item;
	}
	

	@GetMapping("/vipAddress")
	public Object vipAddress() {
		InstanceInfo info = eurekaClient.getNextServerFromEureka("provider-user", false);
		return info.getHomePageUrl();
	}
	
	@GetMapping("/service_info")
	public Object info() {
		ServiceInstance instance= discoveryClient.getLocalServiceInstance();
		return instance;
	}
}
