package org.tuf.arrays.easytab;

import java.util.HashMap;
import java.util.Map;

public class LongestSubStrignWithAtmostKDistinct {
    public static void main(String[] args) {
        String str = "eceba";
        int k = 2;
        System.out.println(findLength(str, k));

    }

    private static int findLength(String str, int k) {
        if (k == 0 || str.isEmpty()) return 0;
        Map<Character, Integer> map = new HashMap<>();
        int start = 0;
        int maxLen = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);

            while (map.size() > k) {
                char left = str.charAt(start++);
                map.put(left, map.get(left) - 1);
                if (map.get(left) == 0)
                    map.remove(left);
            }
            maxLen = Math.max(maxLen, i - start + 1);
        }
        return maxLen;
    }
}
