package com.test.demotest.utils.com.test.demotest.utils;

import org.springframework.core.annotation.AnnotationUtils;
import org.springframework.web.servlet.mvc.condition.RequestCondition;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;

import java.lang.reflect.Method;

/**
 * @Description:
 * @Author: ybc
 * @Date: 2018/10/817:32
 * @Version: 1.0
 */
/**
 * 首先，需要在Servlet配置中注册该类
 * 其次，动态编译时匹配ApiVersion标签，
 * 获取控制器中对应类或方法的版本值.
 */
public class ApiRequestMapping extends RequestMappingHandlerMapping {

// 映射匹配自定义注解（ApiVer标注在类级别）
    @Override
    protected RequestCondition<ApiVerCondition> getCustomTypeCondition(Class<?> handlerType) {
        ApiVer apiVersion = AnnotationUtils.findAnnotation(handlerType, ApiVer.class);
        return createCondition(apiVersion);
    }

    // 映射匹配自定义注解（ApiVer标注在方法级别）
    @Override
    protected RequestCondition<ApiVerCondition> getCustomMethodCondition(Method method){
        ApiVer apiVersion = AnnotationUtils.findAnnotation(method, ApiVer.class);
        return createCondition(apiVersion);
    }

        // 获取当前控制器标注的版本，初始化Api版本条件
        // 参考 @ApiVerCondition注释说明.
        private RequestCondition<ApiVerCondition>  createCondition(ApiVer apiVersion) {
            return apiVersion ==null ?null :new ApiVerCondition(apiVersion.value());
    }


}
