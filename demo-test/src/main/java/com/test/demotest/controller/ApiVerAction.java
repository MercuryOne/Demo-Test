package com.test.demotest.controller;

import com.test.demotest.utils.com.test.demotest.utils.ApiVer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @Author: ybc
 * @Date: 2018/10/817:19
 * @Version: 1.0
 */
@RestController
@RequestMapping("/{v}")
public class ApiVerAction {

    @ApiVer(1)
    @RequestMapping(value="/hello",method=RequestMethod.GET)
    public String helloV1() {
        return "hello world v1";
    }
    @ApiVer(2)
    @RequestMapping(value="/hello",method=RequestMethod.GET)
    public String helloV2() {
        return "hello world v2";
    }
    @ApiVer(3)
    @RequestMapping(value="/hello",method=RequestMethod.GET)
    public String helloV3() {
        return "hello world v3";
    }

}
