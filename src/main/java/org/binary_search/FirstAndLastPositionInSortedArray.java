package org.binary_search;

import java.util.Arrays;

public class FirstAndLastPositionInSortedArray {
    public static void main(String[] args) {
        int[] arr = {5, 6, 6, 7, 8, 8, 8, 9};
        int x = 9;
        int[] result = {-1, -1};
        int lowerBound = getLower(arr, x);
        if (lowerBound == -1) {
            System.out.println(Arrays.toString(result));
            return;
        } else {
            result[0] = lowerBound;
        }
        int upperBound = getUpper(arr, x);
        if (upperBound == -1) {
            System.out.println(Arrays.toString(result));
            return;
        } else {
            result[1] = upperBound;
        }
        System.out.println(Arrays.toString(result));
    }

    private static int getLower(int[] arr, int x) {
        int result = -1;
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (x < arr[mid]) {
                right = mid - 1;
            } else if (arr[mid] < x) {
                left = mid + 1;
            } else {
                result = mid;
                right = mid - 1;
            }
        }
        return result;
    }

    private static int getUpper(int[] arr, int x) {
        int result = -1;
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] > x) {
                right = mid - 1;
            } else if (arr[mid] < x) {
                left = mid + 1;
            } else {
                result = mid;
                left = mid + 1;
            }

        }
        return result;
    }
}
