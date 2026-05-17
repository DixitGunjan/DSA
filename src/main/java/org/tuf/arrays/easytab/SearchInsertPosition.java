package org.tuf.arrays.easytab;

public class SearchInsertPosition {
    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 6};
        int target = 2;
        System.out.println(check(nums, target));
    }

    private static int check(int[] nums, int target) {
        int low = 0, high = nums.length - 1;
        int mid = 0;
        int result = -1;
        while (low <= high) {
            mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                result = mid;
                break;
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        if (result == -1) return low;
        return result;
    }
}
