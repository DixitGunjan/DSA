package org.streams.streams;

import java.util.stream.IntStream;

public class SumOfFirst10naturalNumbers {
    public static void main(String[] args) {
        int sum = IntStream.range(1,11).sum();
        System.out.println(sum);
    }
}
