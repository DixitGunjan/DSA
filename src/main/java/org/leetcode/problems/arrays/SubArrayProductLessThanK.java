package org.leetcode.problems.arrays;

public class SubArrayProductLessThanK {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int k = 0;
        System.out.println(getCount(arr, k));
    }

    private static int getCount(int[] arr, int k) {
        int start = 0;
        int currP = 1;
        int ans = 0;
        if (k <= 1) return 0;
        for (int end = 0; end < arr.length; end++) {
            currP *= arr[end];
            while (currP >= k) {
                currP /= arr[start++];
            }
            ans += end - start + 1;
        }
        return ans;
    }
}
