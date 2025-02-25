package org.leetcode.problems.strings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("geeksforgeeks");
        strings.add("geeks");
        strings.add("geek");
        strings.add("geezer");

        Collections.sort(strings);

        String first = strings.getFirst();
        String last = strings.getLast();

        int i = 0;
        while (i < first.length() && (first.charAt(i) == last.charAt(i))) {
            i++;
        }

        System.out.println(first.substring(0, i));
    }
}
