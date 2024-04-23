package org.leetcode.problems.arrays;

import java.util.Map;
import java.util.TreeMap;

public class MedianOfTwoSortedArrays {

    public static double median(int[] arr1, int[] arr2) {
        int posMap = 0, posArr = 0;
        Map<Integer, Integer> resultmap = new TreeMap<>();
        int[] resultArr = new int[arr1.length + arr2.length];

        for (int j : arr1) {
            resultmap.put(posMap++, j);
        }

        for (int i : arr2) {
            resultmap.put(posMap++, i);
        }
        for (Map.Entry<Integer, Integer> map : resultmap.entrySet()) {
            resultArr[posArr++] = map.getValue();
        }
        int resultArrSize = resultArr.length;
        System.out.println(resultArrSize/2);

        if (resultArrSize % 2 != 0) {

            return resultArr[resultArrSize / 2];
        } else {
            double median = resultArr[resultArrSize / 2] + resultArr[(resultArrSize / 2) + 1];
            return median / 2;
        }

    }

    public static void main(String[] args) {
        int[] arr1 = {1, 3};
        int[] arr2 = {2};
        int[] arr3 = {3, 4};
        System.out.println(median(arr1, arr2));
        System.out.println(median(arr1, arr3));
    }
}
