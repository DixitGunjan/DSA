package org.tuf.strings.mediumtab;

public class StringToInteger {
    public static void main(String[] args) {


        String str = "+1";
        System.out.println(myAtoi(str));
    }

    public static int myAtoi(String str) {

        String trimmed = str.trim();
        if (trimmed.isEmpty()) return 0;
        boolean isNegative = trimmed.charAt(0) == '-';
        boolean isPositive = !isNegative && trimmed.charAt(0) == '+';
        StringBuilder sb = new StringBuilder();
        int i = 0;
        if (isNegative || isPositive) {
            i = 1;
        }
        for (; i < trimmed.trim().length(); i++) {
            char c = trimmed.charAt(i);
            if (Character.isDigit(c)) {
                sb.append(c);
            } else break;
        }
        if (sb.length() == 0) {
            return 0;
        }
        // Handle overflow via long before clamping
        long result = 0;
        for (int j = 0; j < sb.length(); j++) {
            result = result * 10 + (sb.charAt(j) - '0');
            if (result > Integer.MAX_VALUE) {
                break; // avoid unnecessary computation
            }
        }

        if (isNegative) {
            result = -result;
            if (result < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }
        } else {
            if (result > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }
        }

        return (int) result;
    }
}

