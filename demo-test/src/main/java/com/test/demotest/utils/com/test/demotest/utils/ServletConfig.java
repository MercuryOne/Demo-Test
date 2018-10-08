package com.test.demotest.utils.com.test.demotest.utils;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;

/**
 * @Description:
 * @Author: ybc
 * @Date: 2018/10/817:23
 * @Version: 1.0
 */

@Configuration
@EnableWebMvc
@ComponentScan("com.test.demotest.controller")
public class ServletConfig extends WebMvcConfigurerAdapter {

    @Bean
    public RequestMappingHandlerMapping requestMappingHandlerMapping() {
    RequestMappingHandlerMapping handlerMapping =new ApiRequestMapping();
    return handlerMapping;
    }

}
