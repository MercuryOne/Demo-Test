package com.test.demotest.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;


/**
 * @Description:
 * @Author: ybc
 * @Date: 2019/1/2112:49
 * @Version: 1.0
 */
@Configuration
@Data
//@PropertySource(value = "classpath:application.properties")
public class PropertiesConfig {

    @Value("${name}")
    String name;

    @Value("${age}")
    int age;
}
