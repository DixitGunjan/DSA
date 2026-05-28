package org.leetcode.problems.arrays;

public class CountPrimes {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(countPrime(n));
    }

    private static int countPrime(int n) {
        if (n == 0 || n == 1) {
            return 0;
        }
        int result = 0;
        for (int i = 2; i < n; i++) {
            if (isPrime(i)) {
                System.out.println(i);
                result++;
            }
        }
        return result;
    }

    private static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
