package com.qing.learning.java.concurrency;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author guoqf
 * @date 2022/3/1 14:37
 */
public class StreamOptiionalTest {
    public static void main(String[] args) {
        List<Integer> a = Arrays.asList(1, 2, 3);

        List<Integer> collect = a.stream().filter(i -> i > 3).collect(Collectors.toList());
        System.out.println(collect.isEmpty());
    }
}
