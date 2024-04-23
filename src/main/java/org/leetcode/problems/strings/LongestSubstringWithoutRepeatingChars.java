package org.leetcode.problems.strings;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

//ToDo:Complete Code
public class LongestSubstringWithoutRepeatingChars {

    public static String longestSubStr(String input) {

        List<String> resultList = new ArrayList<>();
        String string = "";

        for (int i = 0; i < input.length(); i++) {

            if (i == input.length() - 1) {
                if (input.charAt(i - 1) != input.charAt(i)) {
                    string += "" + input.charAt(i);
                } else {
                    System.out.println("Adding String to List - " + string);
                    resultList.add(string);
                    string = "";
                }
            } else {
                if (input.charAt(i) != input.charAt(i + 1)) {
                    string += "" + input.charAt(i);
                } else {
                    System.out.println("Adding String to List - " + string);
                    resultList.add(string);
                    string = "";
                }
            }

        }

        Stream<String> stream= resultList.stream().map(str -> {
            String max = "";
            if(str.length() >= max.length()){ max = str;}

            return max;
        });
        stream.forEach(System.out::println);
        return null;
    }

    public static void main(String[] args) {
        String input = "bbbb";
        longestSubStr(input);
    }
}
