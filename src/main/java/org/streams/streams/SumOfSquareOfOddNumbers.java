package org.streams.streams;

import java.util.stream.IntStream;

public class SumOfSquareOfOddNumbers {
    public static void main(String[] args) {
        int sum = IntStream.range(1,50).filter( i -> i%2 !=0).map( i ->i*i).sum();
        System.out.println(sum);
    }
}