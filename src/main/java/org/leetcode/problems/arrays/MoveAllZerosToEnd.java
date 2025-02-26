package org.leetcode.problems.arrays;

import java.util.Arrays;

public class MoveAllZerosToEnd {

    public static void main(String[] args) {
        int[] baseArray = {1, 2, 3, 0, 0, 0, 0, 0, 4, 1, 2, 3, 4};
        int length = baseArray.length;
        int[] tempArray = new int[length];
        int k = 0;


        for (int j : baseArray) {
            if (j != 0) {
                tempArray[k++] = j;
            }
        }

        for (int j = k; j < length; j++) {
            tempArray[k++] = 0;
        }

        System.arraycopy(tempArray, 0, baseArray, 0, length);

        System.out.println(Arrays.toString(baseArray));

    }
}
