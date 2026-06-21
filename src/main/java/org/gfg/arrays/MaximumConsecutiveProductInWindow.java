package org.gfg.arrays;

public class MaximumConsecutiveProductInWindow {
    void main() {
        int[] nums = {2,0,5,0,8};
        int k = 2;
        System.out.println(maxProduct(nums, k));
    }

    private int maxProduct(int[] nums, int k) {
        int max = 0;
        int currP = 1;
        int left = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                currP *= nums[i];
            }

            if (i - left + 1 == k) {
                max = Math.max(currP, max);
                if (nums[left] != 0) {
                    currP /= nums[left];
                }
                left++;
            }

        }
        return max;
    }
}
