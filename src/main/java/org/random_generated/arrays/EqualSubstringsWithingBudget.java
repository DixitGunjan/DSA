package org.random_generated.arrays;

public class EqualSubstringsWithingBudget {
    void main() {
        String s = "abcd";
        String t = "defg";
        int cost = 3;

        System.out.println(equalSubstring(s, t, cost));
    }

    private int equalSubstring(String s, String t, int cost) {
        if (cost == 0) return 1;
        int l = 0, r = 0;

        int result = 0;
        int currXost = 0;

        while (r < s.length()) {
            currXost += Math.abs(s.charAt(r) - t.charAt(r));

            while (currXost > cost) {
                currXost -= Math.abs(s.charAt(l) - t.charAt(l));
                l++;
            }

            result = Math.max(result, r - l + 1);
            r++;
        }
        return result;
    }
}
