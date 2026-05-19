package org.tuf.strings.mediumtab;

import java.util.HashMap;
import java.util.Map;

public class SubstringOfFixSizeWithDistinctCharacter {
    public static void main(String[] args) {
        String str = "xyzzaz";
        int k = 3;
        System.out.println(count(str, k));
    }

    private static int count(String str, int k) {
        int start = 0;
        int count = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (int end = 0; end < str.length(); end++) {

            map.put(str.charAt(end), map.getOrDefault(str.charAt(end), 0) + 1);

            if (end - start + 1 == k) {
                int size = map.size();
                if (size == k) {
                    count++;
                }
                char left = str.charAt(start++);
                map.put(left, map.getOrDefault(left, 0) - 1);
                if (map.get(left) == 0) map.remove(left);
            }

        }
        return count;
    }

}
