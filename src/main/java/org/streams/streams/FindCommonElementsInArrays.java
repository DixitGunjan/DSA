package org.streams.streams;

import java.util.List;

public class FindCommonElementsInArrays {
    public static void main(String[] args) {

        List<Integer> list1 = List.of(1,3,5,7,9,11);
        List<Integer> list2 = List.of(1,3,5,13,15,17);

        list1.stream().filter(list2::contains).forEach(System.out::println);

    }
}
