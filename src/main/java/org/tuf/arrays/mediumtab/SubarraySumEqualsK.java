package org.tuf.arrays.mediumtab;

import java.util.HashMap;
import java.util.Map;

public class SubarraySumEqualsK {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int target = 3;
        System.out.println(printCount(arr, target));
    }

    private static int printCount(int[] nums, int target) {
        Map<Integer, Integer> freq = new HashMap<>();
        freq.put(0, 1);

        int sum = 0, count = 0;

        for (int num : nums) {
            sum += num;
            count += freq.getOrDefault(sum - target, 0);
            freq.put(sum, freq.getOrDefault(sum, 0) + 1);
        }

        return count;
    }
}
