package org.tuf.arrays.mediumtab;

public class LongestSubArraySum {
    public static void main(String[] args) {
        int[] arr ={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(subArraySum(arr));
    }

    private static int subArraySum(int[] arr) {
        int max = arr[0];
        int current = arr[0];

        for (int i = 1; i < arr.length; i++) {
            current = Math.max(arr[i], current + arr[i]);
            max = Math.max(max, current);
        }
        return max;
    }
}
