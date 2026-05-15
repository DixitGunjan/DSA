package org.tuf.strings.mediumtab;

public class MaxDepth {
    public static void main(String[] args) {
        String str = "(1)+((2))+(((3)))";
        int depth = 0;
        int max = 0;

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == '(') {
                depth++;
            } else if (c == ')') {
                max = Math.max(max, depth);
                depth--;
            }
        }
        System.out.println(max);
    }
}
