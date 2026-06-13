package org.prep_guide.arrays;

public class LongestSubArraySumEqualToTarget_Positive {
    public static void main(String[] args) {
        int[] arr = {10, 5, 2, 7, 1, 9};
        int target = 15;
        System.out.println(length(arr, target));

    }

    static int length(int[] arr, int target) {
        int left = 0;
        int currSum = 0;
        int maxLength = 0;
        for (int i = 0; i < arr.length; i++) {
            currSum += arr[i];
            while (currSum >= target) {
                if (currSum == target) {
                    int currLen = i - left + 1;
                    maxLength = Math.max(maxLength, currLen);
                    break;
                } else {
                    currSum -= arr[left++];
                }
            }
        }
        return maxLength;
    }
}
