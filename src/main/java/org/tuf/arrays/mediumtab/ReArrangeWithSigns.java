package org.tuf.arrays.mediumtab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReArrangeWithSigns {
    public static void main(String[] args) {
        int[] arr = {3,1,-2,-5,2,-4};

        List<Integer> positveList = new ArrayList<>();
        List<Integer> neagtiveList = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                neagtiveList.add(i);
            } else {
                positveList.add(i);
            }
        }
        int[] temp = new int[arr.length];
        int positiveIndex = 0, negativeIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            int tempIndex;
            if (i % 2 == 0) {
                tempIndex = positveList.get(positiveIndex++);
            } else {
                tempIndex = neagtiveList.get(negativeIndex++);
            }
            temp[i] = arr[tempIndex];
        }
        System.out.println(Arrays.toString(temp));

        //2
        int posIndex = 0;
        int negIndex = 1;
        int[] ans = new int[arr.length];
        for (int j : arr) {
            if (j >= 0) {
                ans[posIndex] = j;
                posIndex += 2;
            } else {
                ans[negIndex] = j;
                negIndex += 2;
            }
        }
        System.out.println(Arrays.toString(ans));
    }
}
