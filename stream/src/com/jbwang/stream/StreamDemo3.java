package com.jbwang.stream;

import java.util.Random;
import java.util.stream.Stream;

/**
 * @author: jbwang0106
 * @description: stream demo 3
 * @create: 2018-06-20 23:27
 **/
public class StreamDemo3 {

    public static void main(String[] args) {

        String str = "my name is 007";

        Stream.of(str.split(" ")).map(s -> s.length()).forEach(System.out::println);

        Stream.of(str.split(" ")).flatMap(s -> s.chars().boxed()).forEach(
                integer -> System.out.println((char) integer.intValue())
        );

        new Random().ints().filter(i -> i > 100 && i < 1000).limit(20).forEach(System.out::println);
    }
}
