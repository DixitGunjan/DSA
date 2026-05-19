package org.leetcode.problems.arrays;

//LC 1052
public class GrumpyBookStoreOwner {
    public static void main(String[] args) {
        int[] c = {1, 0, 1, 2, 1, 1, 7, 5};
        int[] g = {0, 1, 0, 1, 0, 1, 0, 1};
        int minutes = 3;
        System.out.println(getMostSatisfied(c, g, minutes));
    }

    private static int getMostSatisfied(int[] c, int[] g, int minutes) {
        int start = 0;
        int satisfied = 0;
        int currWin = 0;
        int maxWin = 0;

        for (int end = 0; end < c.length; end++) {
            if (g[end] == 0) {
                satisfied += c[end];
            } else {
                currWin += c[end];
            }

            if (end - start + 1 == minutes) {
                maxWin = Math.max(maxWin, currWin);
                if (g[start] == 1) {
                    currWin -= c[start];
                }
                start++;
            }
        }
        return satisfied + maxWin;
    }
}
