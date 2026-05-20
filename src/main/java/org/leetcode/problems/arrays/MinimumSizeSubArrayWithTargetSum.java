package org.leetcode.problems.arrays;

public class MinimumSizeSubArrayWithTargetSum {
    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 2, 4, 3};
        int target = 7;
        System.out.println(minSubArrayLen(target, arr));
    }

    private static int minSubArrayLen(int s, int[] nums) {
        int sum = 0;
        int start = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            while (sum >= s) {
                min = Math.min(min, i - start + 1);
                sum -= nums[start++];
            }
        }
        return min == Integer.MAX_VALUE ? 0 : min;
    }
}
