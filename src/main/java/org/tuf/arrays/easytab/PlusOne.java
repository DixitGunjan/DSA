package org.tuf.arrays.easytab;

import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int[] result = plsuOne(arr);
        System.out.println(Arrays.toString(result));
    }

    private static int[] plsuOne(int[] arr) {
        int n = arr.length;

        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] < 9) {
                arr[i]++;
                return arr;
            }
            arr[i] = 0;
        }
        int[] result = new int[n + 1];
        result[0] = 1;
        return result;
    }

}
