package top.lrshuai.cloud.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class TestController {

	@Autowired
	private RestTemplate restTemplate;
	
	@Autowired
	private LoadBalancerClient loadBalancerClient;
	
	@GetMapping("/provider/{id}")
	public Object test(@PathVariable("id") String id) {
		ServiceInstance serverInstance = loadBalancerClient.choose("producer");
		System.out.println("===="+serverInstance.getHost()+":"+serverInstance.getPort());
		return restTemplate.getForObject("http://producer/item/"+id,Object.class);
	}
}
