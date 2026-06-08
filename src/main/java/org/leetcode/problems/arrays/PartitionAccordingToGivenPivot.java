package org.leetcode.problems.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PartitionAccordingToGivenPivot {
    public static void main(String[] args) {
        int[] arr = {9, 5, 2, 1, 8, 3, 2, 6, 4, 4, 4};
        int pivot = 4;
        reArrange(arr, pivot);
        System.out.println(Arrays.toString(arr));

    }

    private static void reArrange(int[] arr, int pivot) {
        List<Integer> less = new ArrayList<>();
        List<Integer> equal = new ArrayList<>();
        List<Integer> greater = new ArrayList<>();

        for (int i : arr) {
            if (i == pivot) {
                equal.add(i);
            } else if (i > pivot) {
                greater.add(i);
            } else {
                less.add(i);
            }
        }
        int idx = 0;
        for (int i : less) arr[idx++] = i;
        for (int i : equal) arr[idx++] = i;
        for (int i : greater) arr[idx++] = i;

    }
}
