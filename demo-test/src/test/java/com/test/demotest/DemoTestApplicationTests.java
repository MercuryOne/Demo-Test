package com.test.demotest;

import com.test.demotest.constant.PersonConstant;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Random;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoTestApplicationTests {

    @Test
    public void contextLoads() {
    }

    @Test
    public void test() {
        String password = KeyCreate(16);
        System.err.println("test== " + password);
    }


    @Test
    public void propertiesTest() {
        System.err.println(PersonConstant.NAME + "======" + PersonConstant.AGE);

    }

public String KeyCreate(int KeyLength) {
        String base = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%&*:_+<>?~#$@";
        Random random = new Random();
        StringBuffer Keysb = new StringBuffer();
        // 生成指定位数的随机秘钥字符串
        for (int i = 0; i < KeyLength; i++) {
            int number = random.nextInt(base.length()); Keysb.append(base.charAt(number));
        }
        return Keysb.toString();
    }


    /* 二分查询算法 */
    @Test
    public void binarySelectTest() {
        int[] arr = {0,3,6,9,11,25,36,100,1000};
        int start = 0;
        int end = arr.length;
        int data = 36;
        Object o = binarySelect(arr, start, end, data);
        System.err.println("===" + o);

    }

    private Object binarySelect(int[] arr,int start,int end,int data) {

        int mid = (start + end) >> 1;
        if (arr[mid] == data) {
            return arr[mid];
        }
        if (arr[mid] < data) {
            start = mid + 1;
            return binarySelect(arr,start,end,data);
        } else if (arr[mid] > data){
            end = mid -1;
            return binarySelect(arr,start,end,data);
        }
        return -1;
    }



}
