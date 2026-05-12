package org.tuf.arrays.easytab;

import java.util.Arrays;

public class MaxElementInArray {

    public static void main(String[] args) {
        int[] arr = new int[]{3, 3, 6, 1};
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max);

        int maxStream = Arrays.stream(arr).max().getAsInt();
        System.out.println(maxStream);
    }
}
