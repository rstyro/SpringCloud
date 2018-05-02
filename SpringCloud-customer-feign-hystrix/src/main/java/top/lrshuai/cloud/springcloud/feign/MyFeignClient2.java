package top.lrshuai.cloud.springcloud.feign;


import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


/**
 * fallbackFactory 可以说时fallback 的增加版
 * @author rstyro
 *
 */
@FeignClient(name="producer",fallbackFactory=MyHystrixFallbackFactory.class)
public interface MyFeignClient2 {

	@RequestMapping(value="/item/{id}",method=RequestMethod.GET)
	public Object search(@PathVariable("id") String id);
}
