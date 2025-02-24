package org.streams.streams;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindingDuplicateInList {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,3,4,5,6,7,89,89,99,1,2,3,4);

        Set<Integer> set = new HashSet<>();

        List<Integer> resultList = list.stream().filter(n -> !set.add(n)).toList();
        System.out.println(resultList);
    }
}
