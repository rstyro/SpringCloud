package top.lrshuai.cloud.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class TestController {

	@Autowired
	private RestTemplate restTemplate;
	
	 @Value("${user.userServicePath}")
	 private String userServicePath;
	
	@GetMapping("/provider/{id}")
	public Object test(@PathVariable("id") String id) {
		return restTemplate.getForObject(userServicePath+id,Object.class);
	}
}
