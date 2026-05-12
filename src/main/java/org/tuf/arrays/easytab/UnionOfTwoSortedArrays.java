package org.tuf.arrays.easytab;

import java.util.ArrayList;
import java.util.List;

public class UnionOfTwoSortedArrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 2, 7};
        List<Integer> list1 = new ArrayList<>();
        int i = 0, j = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] == arr2[j]) {
                list1.add(arr1[i]);
                i++;
                j++;
            } else {
                if (arr1[i] < arr2[j]) {
                    list1.add(arr1[i]);
                    i++;
                } else {
                    list1.add(arr2[j]);
                    j++;
                }
            }
        }
        if (i != arr1.length) {
            while (i < arr1.length) {
                list1.add(arr1[i]);
                i++;
            }
        }
        if (j != arr2.length) {
            while (j < arr2.length) {
                list1.add(arr2[j]);
                j++;
            }
        }
        System.out.println(list1);
    }
}
