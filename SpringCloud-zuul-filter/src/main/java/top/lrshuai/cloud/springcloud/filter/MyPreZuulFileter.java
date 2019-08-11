package top.lrshuai.cloud.springcloud.filter;

import java.util.UUID;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;

@Component
public class MyPreZuulFileter extends ZuulFilter {

    @Override
    public Object run() {
        System.out.println("这个就是你要过滤的重要方法");
        System.out.println("可以在这里写你的过滤逻辑");
        System.out.println("比如下面的demo");
        RequestContext context = RequestContext.getCurrentContext();
        HttpServletResponse servletResponse = context.getResponse();
        servletResponse.addHeader("X-Foo", UUID.randomUUID().toString());
        return null;
    }

    /**
     * 是否使用这个过滤器，true -- 使用
     */
    @Override
    public boolean shouldFilter() {
        return true;
    }

    /**
     * 执行顺序，返回的数字越大越靠后
     */
    @Override
    public int filterOrder() {
        return 7;
    }

    /**
     * 过滤的类型
     */
    @Override
    public String filterType() {
        // TODO Auto-generated method stub
        /**
         * 有4种：
         * pre
         * post
         * route
         * error
         *
         * 可以看spring-clou-netflix-core-1.3.6RELEASE.jar下的
         * org.springframework.cloud.netflix.zuul.filters.support.FilterConstants 这个类
         *
         */
        return "pre";
    }


}
