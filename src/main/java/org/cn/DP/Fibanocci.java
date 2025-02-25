package org.cn.DP;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Fibanocci {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();
        System.out.println(fibMemo(6, map));
        System.out.println(fibTab(6));

    }

    //top down memoization(start from bigger problem) --> for quick solutions
    public static int fibMemo(int n, Map<Integer, Integer> memo) {
        if (n == 1) return 0;
        if (n == 2) return 1;
        if (!memo.containsKey(n)) {
            memo.put(n, fibMemo(n - 1, memo) + fibMemo(n - 2, memo));
        }
        return memo.get(n);
    }

    //bottoms up tabulation(start from smaller problem)  --> for efficient solutions
    public static int fibTab(int n) {
        List<Integer> tb = new ArrayList<>();
        tb.add(0);
        tb.add(1);

        for (int i = 2; i < n; i++) {
            int n1 = tb.get(i - 1);
            int n2 = tb.get(i - 2);
            tb.add(n1 + n2);
        }
        return tb.get(n - 1);
    }
}
