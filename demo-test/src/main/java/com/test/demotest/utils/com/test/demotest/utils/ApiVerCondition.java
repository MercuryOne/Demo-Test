package com.test.demotest.utils.com.test.demotest.utils;

import org.springframework.web.servlet.mvc.condition.RequestCondition;

import javax.servlet.http.HttpServletRequest;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Description:
 * @Author: ybc
 * @Date: 2018/10/817:28
 * @Version: 1.0
 */

/**
 * 首先，匹配过滤出当前访问接口中是否存在v(1-9)，
 * 如果存在，继续判断格式是否对，否则报错返回。
 * 其次，比较请求地址中版本与控制器中版本，如果
 * 请求的版本值大于控制器中版本值，则取控制器版本
 * 值继续接口后续访问操作。
 */
public class ApiVerCondition implements RequestCondition<ApiVerCondition> {

    private final static Pattern VERSION_PREFIX_PATTERN = Pattern.compile("v(\\d+)/");

    private int apiVersion;

    public ApiVerCondition(int apiVersion){
        this.apiVersion = apiVersion;
    }

    @Override
    public ApiVerCondition combine(ApiVerCondition other) {
        return new ApiVerCondition(other.getApiVersion());
    }

    @Override
    public ApiVerCondition getMatchingCondition(HttpServletRequest request) {
        Matcher m = VERSION_PREFIX_PATTERN.matcher(request.getRequestURI());
        if(m.find()){
            Integer version = Integer.valueOf(m.group(1));
            if(version >=this.apiVersion){
                return this;
            }
        }
        return null;

    }

    @Override
    public int compareTo(ApiVerCondition other, HttpServletRequest request) {
        return other.getApiVersion() -this.apiVersion;
    }

    public int getApiVersion() {
        return apiVersion;
    }

}
