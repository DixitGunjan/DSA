package org.tuf.strings.mediumtab;

import java.util.Map;

public class RomanToInteger {

    public static void main(String[] args) {
        Map<Character, Integer> map = Map.ofEntries(
                Map.entry('I', 1),
                Map.entry('V', 5),
                Map.entry('X', 10),
                Map.entry('L', 50),
                Map.entry('C', 100),
                Map.entry('D', 500),
                Map.entry('M', 1000)
        );

        String str = "LVIII";
        int result = 0;
        int prev = 0;
        for (int i = str.length() - 1; i >= 0; i--) {
            int curr = map.get(str.charAt(i));
            if (curr < prev) {
                result -= curr;
            } else {
                result += curr;
            }
            prev = curr;
        }
        System.out.println(result);
    }
}
