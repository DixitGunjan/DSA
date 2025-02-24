package org.streams.streams;

import java.util.stream.IntStream;

public class QubeAndFilter {

    public static void main(String[] args) {

        IntStream.range(1,11).map( i -> i*i*i)
                .filter( i -> i >=50)
                .forEach(System.out::println);
    }
}
