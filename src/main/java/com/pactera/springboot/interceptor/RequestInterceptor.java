package com.pactera.springboot.interceptor;

import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @description: 请求拦截
 * @author: Lance
 * @create: 2020-10-23
 **/

public class RequestInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        if (StringUtils.isEmpty(request.getSession().getAttribute("member"))) {
            response.sendRedirect("/login");
            return false;
        }
        return true;
    }
}
