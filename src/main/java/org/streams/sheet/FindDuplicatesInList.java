package org.streams.sheet;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicatesInList {
    public static void main(String[] args) {
        List<String> list = List.of("abc", "abc", "bcd", "bcd", "ef", "ef", "hhh", "ii");
        Set<String> seen = new HashSet<>();
        List<String> duplicates = list.stream().filter(s -> !seen.add(s)).toList();
        System.out.println(duplicates);
    }
}
