package org.streams.streams;

import java.util.List;

import static java.util.List.of;

public class AnyMAtch {
    public static void main(String[] args) {
        List<Integer> numbers = of(5, 10, 15, 20);

        boolean r = numbers.stream().anyMatch( i -> i%3 == 0);

        System.out.println(r);
    }
}
