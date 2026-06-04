package org.recursion;

public class Recursion {
    public static void main(String[] args) {
        double n = 2.0000; int pow = -2;
        System.out.println(power(n, pow));
    }

    private static double power(double a, int b) {
        if (b == 0) {
            return 1.0;
        }
        if (b < 0) {
            a = 1 / a;
            b = -b;
        }
        return a * power(a, b - 1);
    }
}
