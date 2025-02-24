package org.streams.streams;

import java.util.Comparator;
import java.util.List;

import static java.util.List.of;

public class SecondLargestInIntegerArray {

    public static void main(String[] args) {


        List<Integer> list = of(1, 2, 3, 4, 9, 8, 7, 6, 5);

        int a = list.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElse(0);

        System.out.println(a);
    }
}

