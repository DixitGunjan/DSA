package org.leetcode.problems.strings;

public class MinimumRecolorsToBlack {

    public static void main(String[] args) {
        String str = "WBBWWBBWBW";
        int k = 7;
        System.out.println(getCount(str, k));
    }

    public static int getCount(String str, int k) {
        int wCount = 0;
        int minWCount = 0;
        for (int i = 0; i < k; i++) {
            if (str.charAt(i) == 'W') {
                wCount++;
            }
        }
        minWCount = wCount;
        for (int i = k; i < str.length(); i++) {
            if (str.charAt(i - k) == 'W') {
                wCount--;
            }
            if (str.charAt(i) == 'W') {
                wCount++;
            }

            minWCount = Math.min(minWCount, wCount);
        }
        return minWCount;
    }
}
