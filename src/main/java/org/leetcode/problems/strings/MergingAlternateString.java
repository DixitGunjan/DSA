package org.leetcode.problems.strings;

public class MergingAlternateString {

    public static String mergeAlternateString(String word1, String word2) {

        if (word1.isEmpty()) return word2;
        if (word2.isEmpty()) return word1;

        String resultString = new String("" + word1.charAt(0) + word2.charAt(0));
        int i, j;
        for (i = 1, j = 1; i < word1.length() && j < word2.length(); i++, j++) {

            resultString = resultString + "" + word1.charAt(i) + word2.charAt(i);
        }
        if (i == word1.length()) {
            resultString += "" + word2.substring(j);
        }
        if (j == word2.length()) {
            resultString += "" + word1.substring(i);
        }
        return resultString;
    }

    public static void main(String[] args) {
        String word1 = "abcd";
        String word2 = "ABCDEF";

        System.out.println(mergeAlternateString(word1, word2));
    }
}
