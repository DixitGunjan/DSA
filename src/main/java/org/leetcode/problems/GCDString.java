package org.leetcode.problems;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
//TODO: pls correct the implementation
public class GCDString {

    public static String gcdString(String str1, String str2) {
        String maxString = "";
        String tempString = "";
        Queue<Character> queue = new LinkedList<>();

        if (str1 == null || str2 == null) {
            return maxString;
        }

        for (int i = 0; i < str1.length(); i++) {
            queue.add(str1.charAt(i));
        }

        for (int i = 0; i < str2.length(); i++) {
            if (queue.poll() == str2.charAt(i)) {
                tempString += "" + queue.peek();
            } else {
                if (tempString.length() > maxString.length()) {
                    maxString = tempString;
                }
                tempString = "";
            }

        }
        return maxString;
    }

    public static void main(String[] args) {
        String str1 = "BCD";
        String str2 = "AB";
        System.out.println(gcdString(str1, str2));
    }
}
