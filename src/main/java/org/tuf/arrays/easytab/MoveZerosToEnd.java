package org.tuf.arrays.easytab;

import java.util.Arrays;

public class MoveZerosToEnd {
    public static void main(String[] args) {
        int[] arr = {0, 0, 0, 8, 1, 3, 5, 0, 7};
        int swap = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[swap];
                arr[swap] = temp;
                swap++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
