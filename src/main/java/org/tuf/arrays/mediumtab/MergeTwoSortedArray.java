package org.tuf.arrays.mediumtab;

import java.util.Arrays;

public class MergeTwoSortedArray {
    public static void main(String[] args) {
        int[] arr = {1, 1, 3, 5};
        int[] arr2 = {1, 2, 4, 6};
        int[] result = merge(arr, arr2);
        System.out.println(Arrays.toString(result));
    }

    public static int[] merge(int[] arr1, int[] arr2) {
        int i = 0, j = 0;
        int[] result = new int[arr1.length + arr2.length];
        int count = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] <= arr2[j]) {
                result[count++] = arr1[i++];
            } else {
                result[count++] = arr2[j++];
            }
        }
        if (i != arr1.length && j == arr2.length) {
            while (i < arr1.length) {
                result[count++] = arr1[i++];
            }
        }
        if (j != arr2.length && i == arr1.length) {
            while (j < arr2.length) {
                result[count++] = arr2[j++];
            }
        }
        return result;
    }
}
