package org.tuf.arrays.mediumtab;

import java.util.Arrays;

public class MergeTwoSortedArrayWithioutExtraSpace {
    public static void main(String[] args) {
        int[] arr1 = {0};
        int[] arr2 = {1};
        merge(arr1, arr2);
        System.out.println(Arrays.toString(arr1));
    }

    private static void merge(int[] arr1, int[] arr2) {
        int count = -1;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == 0) {
                ++count;
                if (count >= arr2.length)
                    break;
                arr1[i] = arr2[count];
            }
        }
        Arrays.sort(arr1);
    }
}
