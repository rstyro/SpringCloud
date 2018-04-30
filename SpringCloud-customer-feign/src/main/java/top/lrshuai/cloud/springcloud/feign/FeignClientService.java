package top.lrshuai.cloud.springcloud.feign;


import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import top.lrshuai.cloud.springcloud.entity.Item;

@FeignClient(name="producer")
public interface FeignClientService {

	@RequestMapping(value="/item/{id}",method=RequestMethod.GET)
	public Object detai(@PathVariable("id") String id);
	
	
	@RequestMapping(value="/add",method=RequestMethod.POST)
	public Object add(Item item);
}
