package org.tuf.arrays.easytab;

public class SecondSmallSecondLargest {
    public static void main(String[] args) {
        int max = 0;
        int secMax = 0;

        int small = Integer.MAX_VALUE;
        int secondSmall = Integer.MAX_VALUE;
        int[] arr = {8, 8, 7, 6, 5};

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (max > arr[i] && arr[i] > secMax) {
                secMax = arr[i];
            }
            if (arr[i] < small) {
                secondSmall = small;
                small = arr[i];
            }
            if (arr[i] < secondSmall && arr[i]!=small) {
                    secondSmall = arr[i];
            }
        }
        System.out.println(max);
        System.out.println(secMax);
        System.out.println(small);
        System.out.println(secondSmall);
    }
}
