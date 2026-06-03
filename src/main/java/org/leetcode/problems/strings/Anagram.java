package org.leetcode.problems.strings;

import java.util.HashMap;
import java.util.Map;

public class Anagram {

    public static void main(String[] args) {

        String str1 = "geeks";
        String str2 = "keegs";


        Map<Character, Integer> charCount = new HashMap<>();

        for (char ch : str1.toCharArray()) {
            charCount.put(ch, charCount.getOrDefault(ch, 0) + 1);
        }

        for (char ch : str2.toCharArray()) {
            charCount.put(ch, charCount.getOrDefault(ch, 0) - 1);
        }

        boolean flag = true;
        for (Map.Entry<Character, Integer> map : charCount.entrySet()) {
            if (map.getValue() != 0) {
                flag = false;
                break;
            }
        }

        if (flag) System.out.println("ANAGRAM");
        else System.out.println("Not ANAGRAM");
    }
}
