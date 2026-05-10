package org.prep_guide.strings;

import java.util.ArrayList;
import java.util.List;

public class AnagramsInString {
    public static void main(String[] args) {
        String str = "cbaebabacd";
        String tar = "abc";
        int window = tar.length();
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i <= str.length() - window; i ++) {
            String temp = str.substring(i, i + window);
            if (isValid(tar, temp)) {
                result.add(i);
            }
        }
        System.out.println(result);

    }

    public static boolean isValid(String tar, String str) {
        int[] strAr = new int[128];
        for (char c : str.toCharArray()) strAr[c]++;

        int[] tarAr = new int[128];
        for (char c : tar.toCharArray()) tarAr[c]++;

        for (int i = 0; i < 128; i++) {
            if (strAr[i] != tarAr[i]) {
                return false;
            }
        }
        return true;
    }
}
