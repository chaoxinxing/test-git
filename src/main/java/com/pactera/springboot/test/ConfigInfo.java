package com.pactera.springboot.test;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @description: 配置信息
 * @author: Lance
 * @create: 2020-10-23
 **/
@Component
@PropertySource(value = "classpath:config/project.properties")
public class ConfigInfo {
    @Value("${project.name}")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
