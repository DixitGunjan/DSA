package org.leetcode.problems.arrays;

import java.util.Arrays;

public class ReverseArrayInGroupus {

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 10, 11, 13};
        int group = 3;
        int length = arr.length;

        for (int i = 0; i < length; i += group) {
            int left = i;
            int right = Math.min(i + group - 1, length - 1);

            while (left < right) {
                if (arr[left] < arr[right]) {
                    int temp = arr[left];
                    arr[left] = arr[right];
                    arr[right] = temp;
                    left++;
                    right--;
                }
            }

        }

        System.out.println(Arrays.toString(arr));
    }
}
