package org.binary_search;

public class UpperBound {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3};
        int x = 2;
        System.out.println(upperBound(arr, x));
    }

    private static int upperBound(int[] arr, int x) {
        int left = 0;
        int right = arr.length - 1;
        int best = arr.length;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] <= x) {
                left = mid + 1;
            } else if (arr[mid] > x) {
                best = mid;
                right = mid - 1;
            }
        }
        return best;
    }
}
