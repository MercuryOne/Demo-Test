package com.test.demotest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoTestApplicationTests {

    @Test
    public void contextLoads() {
    }
    
    @Test
    public void test() {

        System.err.println("test== ");
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
