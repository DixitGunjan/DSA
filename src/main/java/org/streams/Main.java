package org.streams;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        String[] arr = {"wer", "wer", "tyu", "oio", "tyu"};

        Map<String, Long> map = Arrays.stream(arr).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(map
        );
    }
}
