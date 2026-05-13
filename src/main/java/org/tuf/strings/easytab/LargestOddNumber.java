package org.tuf.strings.easytab;

public class LargestOddNumber {
    public static void main(String[] args) {
        String str = "35427";
        String result = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            int temp = str.charAt(i) - '0';
            if (temp % 2 != 0) {
                result = str.substring(0, i + 1);
                break;
            }
        }
        System.out.println(result);
    }
}
