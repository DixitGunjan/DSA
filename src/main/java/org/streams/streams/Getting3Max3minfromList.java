package org.streams.streams;

import java.util.Comparator;
import java.util.List;

import static java.util.List.of;

public class Getting3Max3minfromList {

    public static void main(String[] args) {
        List<Integer> list = of(1,2,3,4,5,6,7,8,9);

        List<Integer> min3 = list.stream().sorted(Comparator.naturalOrder()).limit(3).toList();
        List<Integer> top3 = list.stream().sorted(Comparator.reverseOrder()).limit(3).toList();

        System.out.print(top3);
        System.out.println();
        System.out.print(min3);
    }
}
