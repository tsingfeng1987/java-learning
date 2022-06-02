package com.qing.learning.java.concurrency;

import java.util.Stack;

/**
 * @author guoqf
 * @date 2022/4/15 16:08
 */
public class SortedSetTest {
    public static void main(String[] args) {
        String a = "AAA";
        String b = "BBB";
        String c = "CCC";
        String d = "DDD";
        Stack<String> stack = new Stack<>();
        stack.push(a);
        stack.push(b);
        stack.push(c);
        System.out.println(stack);
        stack.remove(b);
        System.out.println(stack);
        stack.push(b);
        System.out.println(stack);
    }
}
