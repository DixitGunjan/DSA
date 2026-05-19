package org.tuf.arrays.mediumtab;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


//LC1852
public class CountDistinctInEveryGivenWindow {
    public static void main(String[] args) {
        int[] arr = {};
        int k = 0;
        System.out.println(countD(arr, k));
    }

    private static List<Integer> countD(int[] arr, int k) {
        List<Integer> list = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();

        int start = 0;
        for (int end = 0; end < arr.length; end++) {
            map.put(arr[end], map.getOrDefault(arr[end], 0) + 1);

            if (end - start + 1 == k) {
                list.add(map.size());

                int left = arr[start++];
                int count = map.get(left);
                if (count == 0 || count == 1) {
                    map.remove(left);
                } else {
                    map.put(left, map.get(left) - 1);
                }
            }
        }
        return list;
    }
}
