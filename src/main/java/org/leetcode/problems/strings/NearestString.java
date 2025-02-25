package org.leetcode.problems.strings;

import java.util.ArrayList;
import java.util.Arrays;

public class NearestString {
    public static void main(String[] args) {
        ArrayList<String> S = new ArrayList<>(Arrays.asList("the", "quick", "brown", "fox", "quick"));

        String word1 = "the", word2 = "fox";

        int d1 = -1, d2 = -1;

        for (int i = 0; i < S.size(); i++) {
            if (word1.equalsIgnoreCase(S.get(i)))
                d1 = i;
            if (word2.equalsIgnoreCase(S.get(i)))
                d2 = i;
        }

        if (d1 != -1 && d2 != -1) {
            System.out.println(Math.abs(d1 - d2));
        }
    }
}
