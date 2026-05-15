package org.tuf.strings.mediumtab;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.Map.Entry.comparingByValue;

public class FrequencySort {
    public static void main(String[] args) {
        String str = "tree";
        StringBuilder sb = new StringBuilder();
        Map<Character, Integer> map = new HashMap<>();
        for (char c : str.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        List<Character> chars = new ArrayList<>(map.keySet());
        chars.sort((a, b) -> map.get(b) - map.get(a));

        for (char c : chars) {
            sb.append(String.valueOf(c).repeat(Math.max(0, map.get(c))));
        }

        System.out.println(sb);

    }
}
