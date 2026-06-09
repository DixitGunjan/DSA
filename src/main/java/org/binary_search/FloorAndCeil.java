package org.binary_search;

import java.util.Arrays;

public class FloorAndCeil {
    public static void main(String[] args) {
        int[] nums = {3, 4, 4, 7, 8, 10};
        int x = 5;
        System.out.println(Arrays.toString(floorAndCeil(nums, x)));
    }

    private static int[] floorAndCeil(int[] nums, int x) {
        int[] result = {-1, -1};

        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] < x) {
                result[0] = nums[mid];
                left = mid + 1;
            } else if (nums[mid] > x) {
                result[1] = nums[mid];
                right = mid - 1;
            }else{
                result[0] = x;
                result[1] = x;
                return result;
            }
        }
        return result;
    }
}
