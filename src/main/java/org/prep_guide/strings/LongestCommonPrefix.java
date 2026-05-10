package org.prep_guide.strings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Gunjan");
        list.add("Gunj");
        list.add("Gu");


        Collections.sort(list);

        int i = 0;
        String first = list.getFirst();
        String last = list.getLast();
        while (i < first.length() && first.charAt(i) == last.charAt(i)) {
            i++;
        }
        System.out.println(first.substring(0, i));
    }
}
