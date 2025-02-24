package org.streams.streams;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MergeTwoSortedArrayWithDistinct {

    public static void main(String[] args) {

        int[] arr1 = {1,3,5,7,9,11,11};
        int[] arr2 = {2,4,6,8,10,12,12};

        int[] result = IntStream.concat(Arrays.stream(arr1), Arrays.stream(arr2)).sorted().distinct().toArray();

        Arrays.stream(result).forEach(System.out::print);
    }
}
