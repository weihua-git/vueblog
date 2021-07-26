package com.wmyskxz.demo.realm;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

public class Java8Tester {
    public static void main(String args[]) {

        final int[] scores = { 46, 74, 20, 37, 98, 93, 98, 48, 33, 15 };
        final int sum = IntStream.of(scores)
                .reduce(0, (total, score) -> total + score);



    }

    // 使用 java 7 排序
    private void sortUsingJava7(List<String> names) {
        Collections.sort(names, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s1.compareTo(s2);
            }
        });
    }

    // 使用 java 8 排序

    private void sortUsingJava8(List<String> names) {
        Collections.sort(names, (s1, s2) -> s1.compareTo(s2));
    }


}