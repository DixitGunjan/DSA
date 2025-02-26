package org.leetcode.problems.arrays;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 10, 11, 13};
        int length = arr.length;
        int rotation = 4; //left

        int[] tempArray = new int[rotation];

        for (int i = 0; i < rotation; i++) {
            tempArray[i] = arr[i];
        }
        int k = 0;
        for (int i = length - rotation; i < length; i++) {
            arr[k++] = arr[i];
        }
        k = 0;
        for (int i = length - rotation; i < length; i++) {
            arr[i] = tempArray[k++];
        }
        System.out.println(Arrays.toString(arr));
    }
}
