package org.leetcode.problems.strings;

/**
 * Given a string S that consists of only alphanumeric characters and dashes.
 * The string is separated into N + 1 groups by N dashes. Also given an integer K.
 * We want to reformat the string S, such that each group contains exactly K characters, except for the first group, which could be shorter than K but still must contain at least one character.
 * Furthermore, a dash must be inserted between two groups, and you should convert all lowercase letters to uppercase.
 * <p>
 * Input: S = “5F3Z-2e-9-w”, K = 4
 * Output: “5F3Z-2E9W”
 * Explanation: The string S has been split into two parts,
 * each part has 4 characters.
 * Note that two extra dashes are not needed and can be removed.
 */
public class LicenseKey {

    String reformat(String str, int k) {
        String stringWithoutDash = "";

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != '-') {
                stringWithoutDash += str.charAt(i);
            }
        }

        int val = k;
        String resultString = "";

        for (int i = stringWithoutDash.length() - 1; i >= 0; i--) {
            if (val == 0) {
                val = k;
                resultString += '-';
            }
            resultString += stringWithoutDash.charAt(i);
            val--;
        }
        return new StringBuilder(resultString).reverse().toString().toUpperCase();
    }

    public static void main(String[] args) {
        String s = "5F3Z-2e-9-w";
        int K = 5;
        System.out.println(new LicenseKey().reformat(s, K));
    }
}
