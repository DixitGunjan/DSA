package org.prep_guide.strings;

public class MinimumWindowSubstring {
    public static void main(String[] args) {
        String str = "adobecodebanc";
        String tar = "abc";
        String result = "";
        int start = 0;
        for (int end = 0; end < str.length(); end++) {
            while (start <= end && (countMatch(str.substring(start, end + 1), tar))) {
                String curr = str.substring(start, end + 1);
                if (result.isEmpty() || curr.length() < result.length()) {
                    result = curr;
                }
                start++;
            }
        }

        System.out.println(result);


    }

    public static boolean countMatch(String str, String tar) {
        int[] tFeq = new int[128];
        int[] wFreq = new int[128];
        for (char c : tar.toCharArray()) {
            tFeq[c]++;
        }
        for (char c : str.toCharArray()) {
            wFreq[c]++;
        }

        for (int i = 0; i < 128; i++) {
            if (tFeq[i] > wFreq[i]) return false;
        }
        return true;

    }
}
