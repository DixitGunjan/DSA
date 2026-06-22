package org.random_generated.stacks;

import java.util.Stack;

public class MirrorPairs {
    void main() {
        String str = "abcdwxyzfhjjvukfg";

        if (str.isEmpty()) System.out.println("Empty String");
        Stack<Character> stack = new Stack<>();

        for (char c : str.toCharArray()) {

            if (!stack.isEmpty() && isMirror(stack.peek(), c)) {
                stack.pop();
            } else {
                stack.push(c);
            }
        }

        if (stack.isEmpty()) System.out.println("All Were Mirror");
        else stack.forEach(System.out::print);
    }

    private boolean isMirror(char a, char b) {
        return a + b == ('a' + 'z');
    }
}
