package org.tuf.strings.mediumtab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class AlLTargetAnagrams {
    public static void main(String[] args) {
        String s = "cbaebabacd", p = "abc";
        System.out.println(findAnagrams(s, p));
    }

    private static List<Integer> findAnagrams(String s, String t) {
        int len = t.length();
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < s.length() - len + 1; i++) {
            String curr = s.substring(i, i + len);
            char[] chars = curr.toCharArray();
            Arrays.sort(chars);
            curr = String.valueOf(chars);
            if (curr.equals(t)) {
                ans.add(i);
            }
        }
        return ans;

    }
}
