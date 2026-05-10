package org.prep_guide.strings;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstring {

    public static void main(String[] args) {
        String str = "abcabcbb";
        String result = "";

        Set<Character> set = new HashSet<>();
        int initial = 0, end = 0;

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            //found duplicate character
            if (set.contains(c)) {
                String tempString = str.substring(initial, end);
                if (tempString.length() > result.length()) {
                    result = tempString;
                }
                set.clear();
                set.add(c);
                initial = i;
                end = i + 1;
            } else {
                end++;
                set.add(c);
            }
            //End of String, handling
            if (end == str.length()) {
                String temp = str.substring(initial, end);
                if (temp.length() > result.length()) {
                    result = temp;
                }
            }
        }
        if (result.isBlank()) {
            result = str;
        }

        System.out.println(result);
    }
}
