package org.tuf.strings.mediumtab;

public class RemoveOuterParenthesis {
    public static void main(String[] args) {
        String str = "(()())(())(()(()))";

        StringBuilder s = new StringBuilder();
        int depth = 0;
        for (char c : str.toCharArray()) {

            if (c == '(') {
                if (depth > 0) {
                    s.append(c);
                }
                depth++;
            } else {
                depth--;
                if (depth > 0) {
                    s.append(c);
                }
            }
        }
        System.out.println(s.toString());
    }
}
