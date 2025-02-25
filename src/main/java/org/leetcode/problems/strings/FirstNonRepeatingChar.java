package org.leetcode.problems.strings;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FirstNonRepeatingChar {

    public static void main(String[] args) {
        String str = new Scanner(System.in).nextLine();

        Map<Character, Integer> countMap = new LinkedHashMap<>();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ')
                countMap.put(str.charAt(i), (countMap.getOrDefault(str.charAt(i), 0) + 1));
        }
        Character result = null;
        for (Map.Entry<Character, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() == 1) {
                result = entry.getKey();
                break;
            }
        }

        if (result == null) {
            System.out.println("$");
        } else System.out.println("Character is - " + result);
    }
}
