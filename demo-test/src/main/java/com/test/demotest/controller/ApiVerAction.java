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

/**
  * API控制器入口：
  * 首先，根控制器为动态版本{v}，供前端传递；
  * 其次，在接口方法上标注@ApiVer自定义注解；
  * 最后，访问同一个地址时，如：http://。。。/app/v1/hello，
  * 结果返回hello world v1
  */
@RestController
@RequestMapping("/app/{v}")
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
