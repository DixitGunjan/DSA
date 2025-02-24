package org.streams.streams;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public record FlattenListOfLists() {

    public static void main(String[] args) {
        List<List<Integer>> listOfLists = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5, 6),
                Arrays.asList(7, 8, 9)
        );


        List<Integer> resultList = listOfLists.stream().flatMap(Collection::stream).toList();

        System.out.println(resultList);
    }
}
