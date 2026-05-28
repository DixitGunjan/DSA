package org.leetcode.problems.arrays;

import java.util.Arrays;

public class MaximumGap {
    public static void main(String[] args) {

        int[] arr = {9, 6, 3, 1};
        System.out.println(findGap(arr));
    }

    private static int findGap(int[] arr) {
        int maxGap = 0;
        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 1; i++) {
            maxGap = Math.max(maxGap, arr[i + 1] - arr[i]);
        }
        return maxGap;
    }
}
