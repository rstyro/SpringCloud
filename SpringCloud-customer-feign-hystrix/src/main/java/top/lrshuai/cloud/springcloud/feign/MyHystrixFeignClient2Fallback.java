package top.lrshuai.cloud.springcloud.feign;

public class MyHystrixFeignClient2Fallback implements MyFeignClient2{
	@Override
	public Object search(String id) {
		return "search 方法请求失败，id="+id;
	}

}
