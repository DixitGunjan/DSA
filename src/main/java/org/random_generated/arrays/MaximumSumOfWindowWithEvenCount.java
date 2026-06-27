package org.random_generated.arrays;

public class MaximumSumOfWindowWithEvenCount {
    void main() {
        int[] ar = {3, 8, 5, 2, 6, 1, 4};
        int k = 3;
        int count = 0;
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int left = 0;

        for (int i = 0; i < ar.length; i++) {
            currSum += ar[i];
            if (ar[i] % 2 == 0) {
                count++;
            }

            if (i - left + 1 == k) {
                if (count >= 2) {
                    maxSum = Math.max(maxSum, currSum);
                }
                if (ar[left] % 2 == 0) {
                    count--;
                }
                currSum -= ar[left];
                left++;
            }
        }
        System.out.println(maxSum);
    }
}
