package org.random_generated.stacks;

import java.util.Stack;

public class EmailThreadValidator {
    void main() {
        String str = "[<priority>Important<]/priority>]";
        System.out.println(isValidEmail(str));
    }

    private boolean isValidEmail(String str) {
        if (str == null) {
            return false;
        }
        if (str.isEmpty()) return true;
        Stack<String> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == ']') {
                if (stack.isEmpty() || !stack.peek().equals("[")) {
                    return false;
                }
                stack.pop();

            } else if (ch == '[') {
                stack.push(String.valueOf(ch));
            } else if (ch == '<') {
                int end = str.indexOf('>', i);
                if (end == -1) {
                    return false;  // No closing '>' for tag → invalid
                }

                String tagName = str.substring(i + 1, end);
                if (tagName.startsWith("/")) {
                    String endTag = tagName.substring(1);

                    if (stack.isEmpty() || !stack.peek().equals(endTag)) {
                        return false;
                    }
                    stack.pop();
                } else {
                    stack.push(tagName);
                }
                i = end;

            }

        }
        return stack.isEmpty();

    }
}
