package org.prep_guide.arrays;

import java.util.Arrays;

public class RunningSum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(runingSum(arr)));
    }

    private static int[] runingSum(int[] arr) {
        int[] result = new int[arr.length];
        result[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            result[i] = result[i - 1] + arr[i];
        }
        return result;
    }
}
