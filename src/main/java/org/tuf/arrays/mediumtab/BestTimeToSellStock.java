package org.tuf.arrays.mediumtab;

import java.util.ArrayList;
import java.util.List;

public class BestTimeToSellStock {
    public static void main(String[] args) {
        int[] arr = {7, 1, 5, 3, 6, 4};
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : arr) {
            if (price < minPrice) {
                minPrice = price;
            } else {
                maxProfit = Math.max(maxProfit, price - minPrice);
            }
        }
        System.out.println(maxProfit);
    }
}
