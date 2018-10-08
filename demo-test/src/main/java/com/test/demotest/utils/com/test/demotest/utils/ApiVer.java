package com.test.demotest.utils.com.test.demotest.utils;

import org.springframework.web.bind.annotation.Mapping;

import java.lang.annotation.*;

/**
 * @Description:
 * @Author: ybc
 * @Date: 2018/10/817:17
 * @Version: 1.0
 */

@Target({ElementType.TYPE,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Mapping
public @interface ApiVer {
    int value() default 0;
}
