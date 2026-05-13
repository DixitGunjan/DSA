package org.tuf.arrays.mediumtab;

import java.util.Arrays;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        int[] arr = {0, 3, 7, 2, 5, 8, 4, 6, 0, 1};

        Arrays.sort(arr);
        int sequenceCount = 1;
        int tempSequenceCount = 1;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                continue;
            }
            if (arr[i] + 1 == arr[i + 1]) {
                tempSequenceCount++;
            } else {
                sequenceCount = Math.max(sequenceCount, tempSequenceCount);
                tempSequenceCount = 1;
            }

        }
        System.out.println(Math.max(sequenceCount, tempSequenceCount));

    }
}
