package org.tuf.arrays.mediumtab;

import java.util.*;

public class SetMatrixZero {
    public static void main(String[] args) {
        int[][] arr = {
                {0, 2, 0},
                {4, 5, 6},
                {7, 8, 9}
        };
        setZero(arr);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void setZero(int[][] arr) {
        Set<List<Integer>> indices = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == 0) {
                    List<Integer> list = new ArrayList<>();
                    list.add(i);
                    list.add(j);
                    indices.add(list);
                }
            }
        }

        for (List<Integer> list : indices) {
            int i = list.get(0);
            int j = list.get(1);
            setVerticelZero(j, arr.length, arr);
            setHorizontalZero(i, arr[i].length, arr);
        }
    }

    private static void setHorizontalZero(int i, int length, int[][] arr) {
        for (int j = 0; j < length; j++) {
            if (arr[i][j] != 0) {
                arr[i][j] = 0;
            }
        }
    }

    private static void setVerticelZero(int j, int length, int[][] arr) {
        for (int i = 0; i < length; i++) {
            if (arr[i][j] != 0)
                arr[i][j] = 0;
        }
    }
}
