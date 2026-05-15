package org.tuf.strings.easytab;

import java.util.Stack;

public class BackspaceStringCompare {
    public static void main(String[] args) {
        String str1 = "ab#c";
        String str2 = "ad#c";
        System.out.println(backSpaceCompare(str1, str2));
    }

    private static boolean backSpaceCompare(String str1, String str2) {


        return build(str1).equalsIgnoreCase(build(str2));
    }

    private static String build(String str) {
        Stack<Character> stack = new Stack<>();

        for (char ch : str.toCharArray()) {
            if (ch == '#') {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else {
                stack.push(ch);
            }
        }

        StringBuilder sb = new StringBuilder();
        for (char ch : stack) {
            sb.append(ch);
        }
        return sb.toString();
    }
}
