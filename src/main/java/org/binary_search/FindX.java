package org.binary_search;

import java.util.Scanner;

public class FindX {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int x = new Scanner(System.in).nextInt();
        System.out.println(findX(nums, x));
    }

    private static int findX(int[] nums, int x) {
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == x) {
                return mid;
            } else if (x > nums[mid]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}
