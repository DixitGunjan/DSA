package org.binary_search;

public class LowerBound {
    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 3};
        int x = 2;
        System.out.println(lowerBound(nums, x));
    }

    private static int lowerBound(int[] nums, int x) {
        int left = 0;
        int right = nums.length - 1;
        int result = nums.length;
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] >= x) {
                result = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return result;
    }
}
