package org.leetcode.problems;

import org.cn.stacks.StackUsingLL;

import java.util.Stack;

public class RemoveStarsFromStringStack {

    public static String removeStar(String s) {
        if (s.length() == 0) return null;

        StringBuilder output = new StringBuilder();

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != '*') stack.push(s.charAt(i));
            else stack.pop();
        }
        while (!stack.isEmpty()) {
            output.append("" + stack.pop());
        }
        return output.reverse().toString();
    }

    public static void main(String[] args) {
        String str = "leet**cod*e";

        System.out.println(removeStar(str));
    }
}
