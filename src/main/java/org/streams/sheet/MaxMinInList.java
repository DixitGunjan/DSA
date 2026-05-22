package org.streams.sheet;

import java.util.List;

public class MaxMinInList {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int min = list.stream().min(Integer::compareTo).get();
        int max = list.stream().max(Integer::compareTo).get();

        System.out.println(min +"  " + max);
    }
}
