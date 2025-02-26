package org.leetcode.problems.arrays;

import java.util.Arrays;

public class WaveArray {

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 10, 11, 13};
        int length = arr.length;

        Arrays.sort(arr);
        for (int i = 0; i < length - 1; i += 2) {
            new WaveArray().swap(arr, i, i + 1);
        }

        System.out.println(Arrays.toString(arr));

    }

    void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
