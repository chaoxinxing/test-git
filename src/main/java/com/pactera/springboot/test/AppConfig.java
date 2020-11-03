package com.pactera.springboot.test;

import com.pactera.springboot.model.Member;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @description:
 * @author: Lance
 * @create: 2020-10-23
 **/
@Configuration
public class AppConfig {
    /**
     * 注入测试用户信息
     *
     * @return
     */
    @Bean
    public Member member() {
        return new Member("pactera", "文思海辉", "111111", 18);
    }
}
