package org.leetcode.problems.hashsetmap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UniqueOccurences {
    public static boolean uniqueOccurrences(int[] arr) {

        Map<Integer, Integer> countMap = new HashMap<>();

        for (int i : arr) {
            countMap.put(i, countMap.getOrDefault(i, 0) + 1);
        }

        boolean flag = true;

        Set<Integer> count = new HashSet<>();

        for (Map.Entry<Integer, Integer> map : countMap.entrySet()) {
            if (count.contains(map.getValue())) {
                flag = false;
                break;
            } else count.add(map.getValue());
        }
        return flag;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 1, 1, 3};
        System.out.println(uniqueOccurrences(arr));
    }
}
