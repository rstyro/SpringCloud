package top.lrshuai.cloud.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import top.lrshuai.cloud.springcloud.entity.Item;
import top.lrshuai.cloud.springcloud.feign.FeignClientService;
import top.lrshuai.cloud.springcloud.feign.FeignClientService2;

@RestController
public class TestController {
	
	@Autowired
	private FeignClientService feignClientService;
	
	@Autowired
	private FeignClientService2 feignClientService2;
	
	@GetMapping("/provider/{id}")
	public Object test(@PathVariable String id) {
		return feignClientService.detai(id);
	}
	
	@GetMapping("/add")
	public Object test(Item item) {
		return feignClientService.add(item);
	}
	
	@GetMapping("/get/{serviceName}")
	public Object get(@PathVariable("serviceName") String serviceName) {
		return feignClientService2.serverInfo(serviceName);
	}
	
	
}
