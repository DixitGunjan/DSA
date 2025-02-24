package org.streams.streams;

import java.util.stream.Stream;

public class StreamIteratorBasic {

    public static void main(String[] args) {

        Stream.iterate(1, item -> item +1)
                .filter(p -> p%5 == 0)
                .limit(10)
                .forEach(System.out::println);
    }
}
