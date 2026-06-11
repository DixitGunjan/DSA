package org.binary_search;

public class CountOccuranceInSortedArray {
    public static void main(String[] args) {
        int[] arr = {0, 0, 1, 1, 1, 2, 2, 3};
        int target = 1;
        int left = findIndex(arr, target, true);
        if (left == -1) {
            System.out.println(0);
            return;
        }
        int right = findIndex(arr, target, false);
        System.out.println(right - left + 1);

    }

    private static int findIndex(int[] arr, int target, boolean b) {
        int result = -1;
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                result = mid;
                if (b) right = mid - 1;
                else left = mid + 1;
            } else if (target < arr[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return result;
    }
}
