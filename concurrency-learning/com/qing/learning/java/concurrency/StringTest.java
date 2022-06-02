package com.qing.learning.java.concurrency;

/**
 * @author guoqf
 * @date 2022/6/2 7:38
 */
public class StringTest {
    public static void main(String[] args) {
//        String s1 = "hello";
//        String s2 = "def";

        String s5 = "he" + "llo";
//        String s5 = new String("he") + new String("llo");
//        String s1 = "hello";
        String s6 = s5.intern();

        String s7 = s5.intern();

        System.out.println();
        System.out.println(("s5==s6: " + (s5 == s6)));
        System.out.println(("s5==s7: " + (s5 == s7)));
    }
}
