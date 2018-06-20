package com.jbwang.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author: jbwang0106
 * @description: stream-创建流
 * @create: 2018-06-20 22:46
 **/
public class StreamDemo2 {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        //从集合创建流
        list.stream();
        list.parallelStream();

        //从数组创建流
        Arrays.stream(new int[]{1, 2, 3});

        //创建数字流
        IntStream.of(2, 3, 4);
        IntStream.rangeClosed(1, 10);
        //创建一个无限流并进行短路操作
        new Random().ints().limit(10);

        //自己创建流
        Stream.generate(() -> 1).limit(10);
        Stream.iterate(2, (s) -> s * 2).limit(10);
    }
}
