
package org.tuf.arrays.mediumtab;

public class MaxConsecutiveOnesSliding {
    void main() {
        int[] nums = {0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1};
        int k = 3;
        System.out.println(findMaxConsecutive1s(nums, k));
    }


    private int findMaxConsecutive1s(int[] nums, int k) {
        int maxLen = 0;
        int left = 0;
        int zeroC = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                zeroC++;
            }
            if (zeroC == k) {
                int currLen = i - left + 1;
                maxLen = Math.max(maxLen, currLen);
            }
            while (zeroC > k) {
                if (nums[left] == 0) zeroC--;
                left++;
            }
        }
        if (maxLen == 0)
            maxLen = Math.max(nums.length - left, maxLen);

        return maxLen;
    }
}
