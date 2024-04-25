package org.leetcode.problems.hashsetmap;

import java.util.Arrays;
//todo: complete karo
public class CloseStrings {
    public static boolean close(String word1, String word2) {
        char[] char1 = word1.toCharArray();
        char[] char2 = word2.toCharArray();

        Arrays.sort(char1);
        Arrays.sort(char2);

        String str = new String(char1);
        String str1 = new String(char2);

        return str.equals(str1);
    }

    public static void main(String[] args) {
        String one = "a";
        String two = "aa";
        System.out.println(close(one, two));
    }
}
