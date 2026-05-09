package org.streams.streams;

import java.util.Comparator;
import java.util.List;

import static java.util.List.of;

public class SecondLargestInIntegerArray {

    public static void main(String[] args) {


        List<Integer> list = of(1, 2, 3, 4, 9, 8, 7, 6, 5);

        int a = list.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElse(0);

        System.out.println(a);

        Integer[] a1 = {1,2,3,2,1};
        Integer[] a2 = {1,2,3};
        Integer[] a3 = {1,2,3,4};

        List<Integer> a1L = List.of(a1);
        List<Integer> a2L = List.of(a2);
        List<Integer> a3L = List.of(a3);

        //boolean r1 = a1L.containsAll(a)


    }
}

