package org.cn.DP;

public class NumberFactor {
    public static void main(String[] args) {
        System.out.println(new NumberFactor().waysToGetTopToBottomN(4));
        System.out.println(new NumberFactor().waystogetbottomup(4));
    }

    private int waysToGetTopToBottom(int[] dp, int n) {
        if (n == 1 || n == 2 || n == 0) return 1;
        if (n == 3) return 2;

        if (dp[n] == 0) {
            int sp1 = waysToGetTopToBottom(dp, n - 1);
            int sp2 = waysToGetTopToBottom(dp, n - 2);
            int sp3 = waysToGetTopToBottom(dp, n - 3);
            dp[n] = sp1 + sp2 + sp3;
        }
        return dp[n];
    }

    private int waysToGetTopToBottomN(int n) {
        int dp[] = new int[n + 1];
        return waysToGetTopToBottom(dp, n);
    }


    //bottom up
    private int waystogetbottomup(int n) {
        int dp[] = new int[n + 1];
        dp[0] = dp[1] = dp[2] = 1;
        dp[3] = 2;

        for (int i = 4; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 3] + dp[i - 4];
        }
        return dp[n];
    }
}
