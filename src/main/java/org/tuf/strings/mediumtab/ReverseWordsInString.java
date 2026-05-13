package org.tuf.strings.mediumtab;

import java.util.Arrays;

public class ReverseWordsInString {
    public static void main(String[] args) {
        String s = "  hello world  ";
        String[] arr = s.split("\\s+");
        StringBuilder sb = new StringBuilder();

        for (int i = arr.length - 1; i >= 0; i--) {
                sb.append(arr[i].trim());
                if (i > 0) {
                    sb.append(" ");
                }

        }

        System.out.println(sb.toString());

    }
}
