package org.gfg.arrays;

import java.util.ArrayList;
import java.util.List;

public class FirstNegativeInWindowSizeK {
    void main() {
        int[] arr = {12, -1, -7, 8, -15, 30, 16, 28};
        int k = 3;
        System.out.println(firstN(arr, k));
        System.out.println(firstNBF(arr, k));
    }

    //BruteForce
    private List<Integer> firstNBF(int[] arr, int k) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < arr.length - k + 1; i++) {
            int zero = -1;
            for (int j = i; j < i + k; j++) {
                if (arr[j] < 0) {
                    zero = j;
                    break;
                }
            }
            if (zero == -1) {
                result.add(0);
            } else {
                result.add(arr[zero]);
            }
        }
        return result;
    }

    private List<Integer> firstN(int[] arr, int k) {
        int firstNegIdx = -1;
        List<Integer> result = new ArrayList<>();
        int n = arr.length;

        for (int i = 0; i < k; i++) {
            if (arr[i] < 0) {
                firstNegIdx = i;
                break;
            }
        }
        if (firstNegIdx == -1) {
            result.add(0);
        } else result.add(arr[firstNegIdx]);

        for (int i = k; i < arr.length; i++) {
            while (firstNegIdx < i &&
                    (firstNegIdx <= i - k || arr[firstNegIdx] >= 0)) {
                firstNegIdx++;
            }

            if (firstNegIdx < n && arr[firstNegIdx] < 0) {
                result.add(arr[firstNegIdx]);
            } else {
                result.add(0);
            }
        }


        return result;
    }
}
