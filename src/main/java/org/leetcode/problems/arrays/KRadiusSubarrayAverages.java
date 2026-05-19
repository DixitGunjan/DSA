package org.leetcode.problems.arrays;

import java.util.Arrays;

//LC2090
public class KRadiusSubarrayAverages {
    public static void main(String[] args) {
        int[] arr = {7, 4, 3, 9, 1, 8, 5, 2, 6};
        int k = 3;
        int[] result = getAverages(arr, k);
        System.out.println(Arrays.toString(result));
    }

    private static int[] getAverages(int[] arr, int k) {
        long winSum = 0;  // ← Change int to long
        int start = 0;
        int[] result = new int[arr.length];
        Arrays.fill(result, -1);
        int size = 2 * k + 1;

        if (size > arr.length) return result;

        for (int i = 0; i < size; i++) {
            winSum += arr[i];
        }

        for (int i = k; i + k < arr.length; i++) {
            int avg = (int) (winSum / size);  // Cast after division
            result[i] = avg;
            if (i + k + 1 < arr.length)
                winSum += arr[i + k + 1] - arr[start++];
        }
        return result;
    }
}
