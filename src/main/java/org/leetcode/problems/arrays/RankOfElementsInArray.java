package org.leetcode.problems.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RankOfElementsInArray {
    public static void main(String[] args) {


        int[] nums = {3, 40, 20, 10, 9};
        System.out.println(Arrays.toString(rank(nums)));
    }

    private static int[] rank(int[] nums) {
        int[] result = new int[nums.length];
        int[] sorted = Arrays.copyOf(nums, nums.length);
        Arrays.sort(sorted);

        Map<Integer, Integer> map = new HashMap<>();
        int rank = 1;
        for (int i = 0; i < sorted.length; i++) {
            if (!map.containsKey(sorted[i])) {
                map.put(sorted[i], rank++);
            }
        }
        for (int i = 0; i < nums.length; i++) {
            result[i] = map.get(nums[i]);
        }
        return result;
    }
}
