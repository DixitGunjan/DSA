package org.tuf.arrays.easytab;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayLeftRotate {
    public static void main(String[] args) {
        int k = new Scanner(System.in).nextInt();

        int[] arr = {1, 3, 5, 7, 9};

        for (int i = 0; i < k; i++) {
            int temp = arr[0];
            for (int j = 0; j < arr.length - 1; j++) {
                arr[j] = arr[j + 1];
            }
            arr[arr.length - 1] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
