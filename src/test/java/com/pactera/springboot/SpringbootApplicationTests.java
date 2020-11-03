package com.pactera.springboot;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;

@SpringBootTest
public class SpringbootApplicationTests {
    @Autowired
    private Environment environment;

    @Test
    public void test() {
        System.out.println(environment.getProperty("spring.application.name"));
        System.out.println(environment.getProperty("mybatis-plus.mapper-locations"));
    }

}
