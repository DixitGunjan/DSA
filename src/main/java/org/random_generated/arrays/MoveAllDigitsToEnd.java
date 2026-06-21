package org.random_generated.arrays;

public class MoveAllDigitsToEnd {
    void main() {
        String str = "12abc34";
        moveToEnd(str);
    }

    private void moveToEnd(String str) {
        if (str.isEmpty()) {
            System.out.println(str);
            return;
        }
        StringBuilder chars = new StringBuilder();
        StringBuilder digits = new StringBuilder();
        for (char ch : str.toCharArray()) {
            if (Character.isDigit(ch)) {
                digits.append(ch);
            } else {
                chars.append(ch);
            }
        }
        System.out.println(chars.append(digits));
    }
}
