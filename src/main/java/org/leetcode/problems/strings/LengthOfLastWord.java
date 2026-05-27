package org.leetcode.problems.strings;

public class LengthOfLastWord {
    public static void main(String[] args) {
        String str = "   fly me   to   the moon  ";
        System.out.println(findLength(str));
    }
    public static int findLength(String str) {
        String[] strs = str.split("\\s+");
        String lastStr = strs[strs.length-1];
        return lastStr.length();
    }
}
