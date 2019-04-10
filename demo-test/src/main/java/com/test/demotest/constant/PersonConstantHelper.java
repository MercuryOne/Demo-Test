package com.test.demotest.constant;


import com.test.demotest.config.PropertiesConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Description:
 * @Author: ybc
 * @Date: 2019/1/2112:56
 * @Version: 1.0
 */
@Component
public class PersonConstantHelper {

    public static String NAME;
    public static Integer AGE;

    @Autowired
    public void setProperties(PropertiesConfig propertiesConfig){
        PersonConstantHelper.NAME = propertiesConfig.getName();
        System.err.println("PersonConstantHelper=" + propertiesConfig.getName());
        PersonConstantHelper.AGE = propertiesConfig.getAge();
    }

}
