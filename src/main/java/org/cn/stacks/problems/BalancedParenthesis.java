package org.cn.stacks.problems;

import org.cn.stacks.StackUsingLL;
import org.cn.stacks.exceptions.StackEmptyException;

import java.util.Scanner;

public class BalancedParenthesis {

    private static boolean checkValidParenthesis(String str) throws StackEmptyException {
        StackUsingLL<Character> stack = new StackUsingLL<>();

        if (str.isEmpty()) {
            return true;
        }

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == ')') {
                if (!stack.isEmpty() && stack.top() == '(') {
                    stack.pop();
                } else {
                    return false;
                }
            } else if (str.charAt(i) == '}') {
                if (!stack.isEmpty() && stack.top() == '{') {
                    stack.pop();
                } else {
                    return false;
                }
            } else if (str.charAt(i) == ']') {
                if (!stack.isEmpty() && stack.top() == '[') {
                    stack.pop();
                } else {
                    return false;
                }
            } else {
                if (str.charAt(i) == '{' || str.charAt(i) == '(' || str.charAt(i) == '[') {
                    stack.push(str.charAt(i));
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) throws StackEmptyException {
        String str = new Scanner(System.in).nextLine();
        System.out.println(checkValidParenthesis(str));
    }
}
