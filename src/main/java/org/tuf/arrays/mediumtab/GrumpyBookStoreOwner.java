package org.tuf.arrays.mediumtab;

public class GrumpyBookStoreOwner {
    void main() {
        int[] c = {1, 0, 1, 2, 1, 1, 7, 5};
        int[] g = {0, 1, 0, 1, 0, 1, 0, 1};
        int minutes = 3;
        System.out.println(countHappy(c, g, minutes));
    }

    private int countHappy(int[] customers, int[] grumpy, int minutes) {
        int happy = 0;
        int extra = 0;
        int start = 0;
        int maxExtra = 0;
        for (int end = 0; end < customers.length; end++) {
            if (grumpy[end] == 0) {
                happy += customers[end];
            } else {
                extra += customers[end];
            }
            if (end - start + 1 == minutes) {
                maxExtra = Math.max(maxExtra, extra);
                if (grumpy[start] != 0) {
                    extra -= customers[start];
                }
                start++;
            }
        }
        return happy + maxExtra;
    }
}
