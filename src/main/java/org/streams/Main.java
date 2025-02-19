package org.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        String[] arr = {"wertix", "wer12", "tyu1111", "oio", "tyu11111"};

        // Map<String, Long> map = Arrays.stream(arr).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        Arrays.stream(arr).sorted(Comparator.comparing(String::length)).forEach(System.out::println);

    }
}
