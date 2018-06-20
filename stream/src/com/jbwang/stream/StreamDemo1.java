package com.jbwang.stream;

import java.util.stream.IntStream;

/**
 * @author: jbwang0106
 * @description: stream demo 1
 * @create: 2018-06-20 22:27
 **/
public class StreamDemo1 {

    public static void main(String[] args) {

        int [] nums = {1, 2, 3};

        int sum = 0;

        //外部迭代
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }

        System.out.println("结果为: " + sum);

        //内部迭代
        sum = IntStream.of(nums).map(i -> i * 2).sum();
        System.out.println("结果为：" + sum);

        //中间操作，返回的还是stream
        //终止操作，返回一个结果
        //惰性求值，只要不进行终止操作，中间操作可以先不进行
        sum = IntStream.of(nums).map(StreamDemo1::doubleInt).sum();
        System.out.println(sum);

        IntStream stream = IntStream.of(nums).map(StreamDemo1::doubleInt);
        System.out.println(stream);
    }

    private static int doubleInt(int i) {
        System.out.println("乘以2");
        return i * 2;
    }
}
