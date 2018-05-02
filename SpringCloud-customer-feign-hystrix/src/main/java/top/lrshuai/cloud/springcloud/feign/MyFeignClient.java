package top.lrshuai.cloud.springcloud.feign;


import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@FeignClient(name="producer",fallback=MyHystrixFallback.class)
public interface MyFeignClient {

	@RequestMapping(value="/item/{id}",method=RequestMethod.GET)
	public Object detai(@PathVariable("id") String id);
}
