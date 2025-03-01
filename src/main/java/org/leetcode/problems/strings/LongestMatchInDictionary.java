/**
 * Giving a dictionary and a string ‘str’,
 * find the longest string in dictionary which can be formed by
 * deleting some characters of the given ‘str’.
 * <p>
 * Input : dict = {"ale", "apple", "monkey", "plea"}
 * str = "abpcplea"
 * Output : apple
 */

package org.leetcode.problems.strings;

import java.util.List;

public class LongestMatchInDictionary {

    static public boolean isSubSequence(String word, String matchWord) {

        int j = 0;
        for (int i = 0; i < matchWord.length() && j < word.length(); i++) {
            if (word.charAt(j) == matchWord.charAt(i)) {
                j++;
            }
        }
        return (j == word.length());
    }

    static public String longestMatch(List<String> words, String wordToMatch) {
        String res = "";
        int length = 0;

        for (String word : words) {
            if (length < word.length() && isSubSequence(word, wordToMatch)) {
                res = word;
                length = word.length();
            }
        }
        return res;
    }

    public static void main(String[] args) {
        List<String> list = List.of("ale", "apple", "monkey", "plea");
        String str = "abpcplea";
        System.out.println(longestMatch(list, str));
    }
}
