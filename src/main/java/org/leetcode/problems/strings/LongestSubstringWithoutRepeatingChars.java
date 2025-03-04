package org.leetcode.problems.strings;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

//todo
public class LongestSubstringWithoutRepeatingChars {

    public static String longestSubStr(String input) {

        String result = "";
        StringBuilder tempString = new StringBuilder("" + input.charAt(0));

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != input.charAt(i + 1)) {
                tempString.append(input.charAt(i));
            } else {
                if (tempString.length() > result.length()) {
                    result = tempString.toString();
                    tempString = new StringBuilder();
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String input = "abcdefabcbb";
        System.out.println(longestSubStr(input));
    }
}
