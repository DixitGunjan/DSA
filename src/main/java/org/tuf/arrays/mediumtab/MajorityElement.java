package org.tuf.arrays.mediumtab;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static void main(String[] args) {
        int[] nums = {3, 2, 3};
        Map<Integer, Integer> count = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            count.put(nums[i], count.getOrDefault(nums[i], 0) + 1);
        }
        int cond = nums.length / 2;
        int max = 0;
        int maxKey = 0;
        for (Map.Entry<Integer, Integer> entry : count.entrySet()) {
            int value = entry.getValue();
            if (value > cond) {
                int temp = value;
                if (temp > max) {
                    max = temp;
                    maxKey = entry.getKey();
                }
            }

        }
        System.out.println(maxKey);
    }
}
