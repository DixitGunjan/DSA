package org.leetcode.problems.arrays;

import java.util.HashMap;
import java.util.Map;

public class FruitsIntoBasket {
    public static void main(String[] args) {
        int[] arr = {1, 2, 1};
        System.out.println(fiB(arr));
    }


    private static int fiB(int[] arr) {
        int start = 0;
        int maxLen = 0;
        Map<Integer, Integer> basket = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            basket.put(arr[i], basket.getOrDefault(arr[i], 0) + 1);
            while (basket.size() > 2) {
                int left = arr[start++];
                basket.put(left, basket.get(left) - 1);
                if (basket.get(left) == 0) {
                    basket.remove(left);
                }
            }
            maxLen = Math.max(maxLen, i - start + 1);
        }
        return maxLen;
    }
}
