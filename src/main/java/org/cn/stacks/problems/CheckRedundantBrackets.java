package org.cn.stacks.problems;

import org.cn.stacks.StackUsingLL;
import org.cn.stacks.exceptions.StackEmptyException;

import java.util.Scanner;

public class CheckRedundantBrackets {

    public static boolean check(String str) throws StackEmptyException {
        StackUsingLL<Character> stack = new StackUsingLL<>();

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == '(') {
                stack.push(str.charAt(i));
            }

            if (str.charAt(i) == ')') {
                if (!stack.isEmpty() && stack.top() == '(') {
                    stack.pop();
                } else return false;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) throws StackEmptyException {
        String str = new Scanner(System.in).nextLine();
        System.out.println(check(str));
    }
}
