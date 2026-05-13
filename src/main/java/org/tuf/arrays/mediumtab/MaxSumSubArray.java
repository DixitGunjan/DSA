package org.tuf.arrays.mediumtab;

public class MaxSumSubArray {
    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        int sum = 0;
        int maxSum = 0;
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            for(int j =arr.length-1;j>=i;j--){
                sum+=arr[j];
            }
            maxSum = Math.max(maxSum,sum);
        }
        System.out.println(maxSum);
    }
}
