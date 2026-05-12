package org.tuf.arrays.easytab;

public class LongestSubArrayWithSum {
    public static void main(String[] args) {
        int[] arr = {1, 5};
        int tar = 6;
        int max = 0;
        if (arr.length == 0) return;
        if (arr.length == 1) {
            if (arr[0] == tar) {
                max++;
            }
        } else {

            for (int i = 0; i < arr.length - 1; i++) {
                int tempSum = arr[i];
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[j] + tempSum == tar) {
                        if (j - i + 1 > max) {
                            max = j - i + 1;
                            break;
                        }
                    } else {
                        tempSum = arr[j] + tempSum;
                    }
                }

            }
        }
        System.out.println(max);
    }
}
