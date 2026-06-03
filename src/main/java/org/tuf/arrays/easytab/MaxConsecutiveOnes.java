package org.tuf.arrays.easytab;

public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        int[] arr = {1, 1, 0, 0, 1, 1, 1, 0};
        int maxCount = 0;
        int tempCount = 0;

        for (int j : arr) {
            if (j == 1) {
                tempCount++;
            } else {
                maxCount = Math.max(maxCount, tempCount);
                tempCount = 0;
            }
        }
        maxCount = Math.max(maxCount, tempCount);
        System.out.println(maxCount);
    }
}