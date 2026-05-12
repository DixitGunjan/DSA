package org.tuf.arrays.easytab;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateFromSortedArray {
    public static void main(String[] args) {
        int[] arr = {0, 0, 3, 3, 3, 5, 5, 6, 6, 6, 7, 9};

        //1st
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length - 1; i++) {
            int cur = arr[i];
            if (i != 0) {
                if (arr[i] == arr[i - 1]) {
                    int temp = arr[i];
                    shiftArray(i - 1, arr);
                    arr[arr.length - 1] = temp;
                }
            }
            if (arr[i] == arr[i + 1]) {
                int temp = arr[i + 1];
                shiftArray(i, arr);
                arr[arr.length - 1] = temp;
            }
            if (!set.contains(cur))
                set.add(arr[i]);
        }
        Arrays.stream(arr).forEach(System.out::println);

        //2nd
        int[] arr2 = {0, 0, 3, 3, 3, 5, 5, 6, 6, 6, 7, 9};
        Set<Integer> set2 = new HashSet<>();
        for (int i : arr2) set2.add(i);
        int j = 0;
        for (int i : set2.stream().toList()) {
            arr2[j++] = i;
        }
        System.out.println(Arrays.toString(arr2));
    }

    private static void shiftArray(int curr, int[] temp) {
        int j = curr + 1;
        while (j < temp.length - 1) {
            temp[j] = temp[j + 1];
            j++;
        }
    }
}
