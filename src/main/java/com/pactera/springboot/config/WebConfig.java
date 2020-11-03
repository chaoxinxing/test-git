package com.pactera.springboot.config;

import com.pactera.springboot.interceptor.RequestInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @description:
 * @author: Lance
 * @create: 2020-10-23
 **/
@Configuration
public class WebConfig implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new RequestInterceptor())
                .addPathPatterns("/**")
                .excludePathPatterns("/", "/login", "/register", "/logout", "/error",
                        "/submitLogin", "/submitRegister");
    }
}
