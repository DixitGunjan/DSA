package org.leetcode.problems.strings;

import java.util.*;
import java.util.stream.Stream;


public class LongestSubstringWithoutRepeatingChars {

    public static String longestSubStr(String input) {
        int left = 0;
        int bestStart = 0;
        int maxLength = 0;
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            while (set.contains(currentChar)) {
                set.remove(input.charAt(left++));
            }
            set.add(currentChar);
            int currLen = i - left + 1;
            if (currLen > maxLength) {
                maxLength = currLen;
                bestStart = left;
            }
        }
        System.out.println("max len - " + maxLength);
        return input.substring(bestStart, bestStart + maxLength);
    }

    public static void main(String[] args) {
        String input = "abcdefabcbb";
        System.out.println(longestSubStr(input));
    }
}
