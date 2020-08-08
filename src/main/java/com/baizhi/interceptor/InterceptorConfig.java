package com.baizhi.interceptor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration //交由Spring工厂管理
public class InterceptorConfig extends WebMvcConfigurerAdapter {

    @Autowired
    private LoginForceInterceptor loginForceInterceptor;


    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //把强制登陆的拦截器  注册到注册中心中
        registry.addInterceptor(loginForceInterceptor).addPathPatterns("/**").excludePathPatterns("/user/login").excludePathPatterns("/user/register");
    }
}
