package org.leetcode.problems.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class NextGreaterElement {
    public static void main(String[] args) {
        int[] nums = {4, 1, 2};
        int[] source = {1, 3, 4, 2};
        System.out.println(Arrays.toString(nextGreaterElements(nums, source)));

    }

    public static int[] nextGreaterElements(int[] nums, int[] source) {
        Map<Integer, Integer> sourceNextMap = new HashMap<>();
        int[] result = new int[nums.length];
        for (int i = 0; i < source.length; i++) {
            if (i == source.length - 1) {
                sourceNextMap.put(source[i], -1);
                break;
            }
            int curr = source[i];
            int next = source[i + 1];
            if (next > curr) {
                sourceNextMap.put(curr, next);
            } else {
                sourceNextMap.put(curr, -1);
            }
        }
        for (int i = 0; i < nums.length; i++) {
            result[i] = sourceNextMap.get(nums[i]);
        }
        return result;
    }
}
