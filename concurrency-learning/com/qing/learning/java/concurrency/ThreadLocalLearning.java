package com.qing.learning.java.concurrency;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.function.Supplier;
import java.util.stream.Collectors;

/**
 * @author guoqf
 * @date 2022/1/11 17:38
 *
 */
public class ThreadLocalLearning {

    public static void main(String[] args) {
        /*ThreadLocal<ThreadLocalLearning> tl = new ThreadLocal<>();
         int HASH_INCREMENT = 0b1100001110010001000011001000111;
        ThreadLocal.withInitial(ThreadLocalLearning::new);*/

//        String uuid = UUID.randomUUID().toString().replace("-", "");
//        System.out.println(uuid);


        testListFilter();
    }

    private static void testListFilter() {
        List<Test> tList = new ArrayList<>(2);

        Test t = new Test();
        t.pName = "1";
        tList.add(t);

        t = new Test();
        t.pName = "2";
        tList.add(t);

        System.out.println("===============================");
        System.out.println(tList);
        System.out.println("***************************");
        Map<Long, List<Test>> collect = tList.stream().filter(tt -> tt.pId != null).collect(Collectors.groupingBy(Test::getpId));
        System.out.println(collect);
        System.out.println("==============================="+collect.size());
    }


    private static final class Test{
        private Long pId;

        private String pName;

        public Long getpId() {
            return pId;
        }

        public void setpId(Long pId) {
            this.pId = pId;
        }

        public String getpName() {
            return pName;
        }

        public void setpName(String pName) {
            this.pName = pName;
        }

        @Override
        public String toString() {
            return "pId: " + pId + "\n" + "pName: " + pName;
        }
    }
}
