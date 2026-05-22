package org.streams.sheet;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountingStringsInALIst {
    public static void main(String[] args) {
        List<String> strings = List.of("abc", "abc", "bcd", "bcd", "ef", "ef", "ef", "hhh", "ii");
        Map<String, Long> map = strings.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(map);
    }
}
