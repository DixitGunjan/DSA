package org.tuf.arrays.mediumtab;

public class MaximumPointsFromCards {
    public static void main(String[] args) {
        int[] cards = {9,7,7,9,7,7,9};
        int k = 7;
        System.out.println(maxPoints(cards, k));
    }

    private static int maxPoints(int[] cards, int k) {
        int max = 0;

        if (cards.length == k) {
            int sum = 0;
            for (int i = 0; i < cards.length; i++) {
                sum += cards[i];
            }
            max = Math.max(sum, max);
        } else {
            int sum = 0;
            for (int i = 0; i < k; i++) {
                sum += cards[i];
            }
            max = Math.max(sum, max);
            sum = 0;
            for (int i = cards.length - 1; i > cards.length - 1 - k; i--) {
                sum += cards[i];
            }
            max = Math.max(sum, max);

        }
        return max;
    }
}
