package org.streams.sheet;

import java.util.List;

public class StringWithGivenPrefix {
    public static void main(String[] args) {
        List<String> list = List.of("Gunjan", "Gundan", "Bundan", "Nundan");
        String prefix = "Gu";

        List<String> result = list.stream().filter( s -> s.startsWith(prefix)).toList();
        System.out.println(result);
    }
}
