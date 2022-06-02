package com.qing.learning.java.concurrency;

/**
 * @author guoqf
 * @date 2022/3/1 14:01
 */
public class JavaOperatorTest {

    public static void main(String[] args) {
        int a = 0;

        boolean b = true || false && false;
        boolean b1 = (true || false) && false;

        System.out.println("b= " + b + ", b1=" + b1);
    }
}
