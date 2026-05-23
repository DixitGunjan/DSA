package org.streams.streams;

import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.groupingBy;

public class GroupingWordsByLength {
    public static void main(String[] args) {
        List<String> strings = List.of("a", "b", "c", "d", "e", "f",
                "aa", "bb", "cc");
        Map<Integer, List<String>> str = strings.stream().collect(groupingBy(String::length));
        System.out.println(str);
    }
}
