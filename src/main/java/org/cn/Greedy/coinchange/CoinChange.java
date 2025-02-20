package org.cn.Greedy.coinchange;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CoinChange {
    public static void main(String[] args) {
        List<Integer> coins = Arrays.asList(1, 2, 5, 10, 20, 50, 100, 1000);
        int amount = 1000;

        CoinChange.coinChange(coins, amount);
    }

    public static void coinChange(List<Integer> coinsList, int amount) {
        Collections.sort(coinsList);

        int index = coinsList.size() - 1;

        while (true) {
            int coinValue = coinsList.get(index);
            index--;
            int maxAmount = (amount / coinValue) * coinValue;

            if (maxAmount > 0) {
                System.out.println("Coin value -  " + coinValue + "taken count -" + (amount / coinValue));
                amount = amount - maxAmount;
            }

            if (amount == 0) break;

        }
    }
}
