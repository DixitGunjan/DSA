package org.leetcode.problems.strings;

public class validPalindromicString {
    public static void main(String[] args) {
        String str = "A man, a plan, a canal: Panama";
        System.out.println(isvalid(str));
    }

    private static boolean isvalid(String str) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < str.length(); i++) {
            if(Character.isAlphabetic(str.charAt(i)) || Character.isDigit(str.charAt(i))) {
                sb.append(Character.toLowerCase(str.charAt(i)));
            }
        }
        return sb.toString().contentEquals(sb.reverse());
    }
}
