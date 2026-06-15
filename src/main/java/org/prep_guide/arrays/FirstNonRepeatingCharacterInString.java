package org.prep_guide.arrays;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingCharacterInString {
    void main() {
        String s = "swiss";
        System.out.println(firstNonRepeatingCharacter(s));
    }

    private char firstNonRepeatingCharacter(String s) {
        Map<Character, Integer> map = new LinkedHashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return '0';
    }
}
