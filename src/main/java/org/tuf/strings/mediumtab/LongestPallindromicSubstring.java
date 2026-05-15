package org.tuf.strings.mediumtab;

public class LongestPallindromicSubstring {
    public static void main(String[] args) {
        String str = "a";
        System.out.println(lengthOfLongestSubstring(str));
    }

    public static String lengthOfLongestSubstring(String s) {
        s = s.trim();
        if (s.isEmpty()) return "";
        if(s.length() == 1) return s;

        int max = 0;
        String longestStr = "";
        for (int i = 0; i < s.length(); i++) {
            for (int j = s.length() - 1; j > i; j--) {
                String subStr = s.substring(i, j + 1);
                boolean isP = isPalindrome(subStr);
                if (isP) {
                    int len = subStr.length();
                    if (len > max) {
                        max = len;
                        longestStr = subStr;
                    }
                }
            }
        }

        return longestStr;
    }

    public static boolean isPalindrome(String str) {
        return str.equalsIgnoreCase(new StringBuilder(str).reverse().toString());
    }
}
