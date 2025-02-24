package org.streams.streams;

import java.util.Arrays;

public class SumAndAverageOfIntegerArray {

    public static void main(String[] args) {
        int[] arr = {1,3,5,7,9,11};

        int sum = Arrays.stream(arr).sum();
        double avg = Arrays.stream(arr).average().getAsDouble();

        System.out.println(sum);
        System.out.println(avg);
    }
}
