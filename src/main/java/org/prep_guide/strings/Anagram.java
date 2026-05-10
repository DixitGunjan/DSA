package org.prep_guide.strings;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        sc.close();

        if (s1.length() != s2.length()) {
            System.out.println(false);
        } else {

            char[] charArray = s1.toCharArray();
            Arrays.sort(charArray);
            char[] charArray2 = s2.toCharArray();
            Arrays.sort(charArray2);
            s1 = String.valueOf(charArray);
            s2 = String.valueOf(charArray2);

            System.out.println(s1.equalsIgnoreCase(s2));
        }
    }
}
