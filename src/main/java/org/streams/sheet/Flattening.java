package org.streams.sheet;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Flattening {
    void main() {

        List<List<Integer>> numbers = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5),
                Arrays.asList(6, 7, 8)
        );

        List<Integer> result = numbers.stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());

        System.out.println(result);
    }
}