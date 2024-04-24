package org.leetcode.problems.strings;

import java.util.HashMap;
import java.util.Map;

public class CountEachoccurance {

    public static void countEach(String str) {
        Map<Character, Integer> countMap = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            countMap.put(str.charAt(i), countMap.getOrDefault(str.charAt(i), 0) + 1);
        }
        countMap.entrySet().forEach(System.out::println);
    }

    public static void main(String[] args) {
        countEach("GUNJAN DIXIT");
    }
}
