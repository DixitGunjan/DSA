package org.cn.arrays;

import java.util.Arrays;

public class MergeSortedArrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7, 11};
        int[] arr2 = {2, 4, 6, 8, 10};

        int[] resultArray = new int[arr1.length + arr2.length];

        int i = 0, j = 0, k = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] <= arr2[j]) {
                resultArray[k++] = arr1[i++];
            } else
                resultArray[k++] = arr2[j++];
        }

        if (i < arr1.length) {
            while (i != arr1.length) {
                resultArray[k++] = arr1[i++];
            }
        }

        if (j < arr2.length) {
            while (j != arr2.length) {
                resultArray[k++] = arr2[j++];
            }
        }

        Arrays.stream(resultArray).forEach(System.out::println);
    }
}
