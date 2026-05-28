package org.leetcode.problems.arrays;

public class HouseRobber {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1};
        System.out.println(findMaxAmount(arr));
    }

    private static int findMaxAmount(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];

        int prev2 = 0;
        int prev1 = 0;

        for (int num : nums) {
            int current = Math.max(prev1, prev2 + num);
            prev2 = prev1;
            prev1 = current;
        }

        return prev1;
    }
}
