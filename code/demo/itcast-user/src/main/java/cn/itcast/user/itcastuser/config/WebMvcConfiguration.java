package cn.itcast.user.itcastuser.config;


import cn.itcast.user.itcastuser.interceptor.MyInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * The type Web mvc configuration.
 * 配置拦截器：声明该类是一个java配置类
 * 实现WebConfigurer接口
 */
@Configuration
public class WebMvcConfiguration implements WebMvcConfigurer {
    @Autowired
    private MyInterceptor myInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(myInterceptor).addPathPatterns("/**");

    }
}
