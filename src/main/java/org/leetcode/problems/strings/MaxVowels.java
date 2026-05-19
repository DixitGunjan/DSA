package org.leetcode.problems.strings;

public class MaxVowels {
    public static void main(String[] args) {
        String str = "abciiidef";
        int k = 3;
        System.out.println(count(str, k));
    }

    private static int count(String s, int k) {
        int maxCount = 0;
        int start = 0;
        int count = 0;
        for (start = 0; start < k; start++) {
            if (isVowel(s.charAt(start))) {
                count++;
            }
        }
        maxCount = count;
        for (int end = k; end < s.length(); end++) {

            if (isVowel(s.charAt(end))) {
                count++;
            }
            if (isVowel(s.charAt(end - k))) {
                count--;
            }
            maxCount = Math.max(maxCount, count);
        }
        return maxCount;
    }

    private static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
