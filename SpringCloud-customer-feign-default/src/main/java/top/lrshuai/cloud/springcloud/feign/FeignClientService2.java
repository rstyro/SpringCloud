package top.lrshuai.cloud.springcloud.feign;


import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import top.lrshuai.cloud.config.FeignConfig2;


@FeignClient(name="test",url="http://localhost:8761/",configuration=FeignConfig2.class)
public interface FeignClientService2 {

	@RequestMapping(value="/{serviceName}",method=RequestMethod.GET)
	public Object serverInfo(@PathVariable("serviceName") String serviceName);
	
}
