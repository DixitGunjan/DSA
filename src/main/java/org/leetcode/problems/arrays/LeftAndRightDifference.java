package org.leetcode.problems.arrays;

import java.util.Arrays;

public class LeftAndRightDifference {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(leftRightDifference(arr)));
    }

    public static int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int[] left = new int[n];
        int[] right = new int[n];

        int currSum = 0;
        for (int i = 0; i < n; i++) {
            left[i] = currSum;
            currSum += nums[i];
        }

        currSum = 0;
        for (int i = n - 1; i >= 0; i--) {
            right[i] = currSum;
            currSum += nums[i];
        }

        for (int i = 0; i < n; i++) {
            nums[i] = Math.abs(left[i] - right[i]);
        }
        return nums;
    }
}
