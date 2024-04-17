package org.leetcode.problems;

public class KidwithGreaterCandies {

    public static boolean[] checkGreaterCandies(int[] candies, int extraCandies) {
        boolean flag = false;

        boolean[] resultCandies = new boolean[candies.length];

        for (int i = 0; i < candies.length; i++) {
            int curCandies = candies[i] + extraCandies;

            for (int candy : candies) {
                if (curCandies >= candy) {
                    flag = true;
                } else {
                    flag = false;
                    break;
                }
            }
            resultCandies[i] = flag;
        }
        return resultCandies;
    }

    public static void main(String[] args) {
        int[] input = {4, 2, 1, 1, 2};
        int extraCandies = 1;
        boolean[] result = checkGreaterCandies(input, extraCandies);
        for (boolean b : result) {
            System.out.println(b);
        }
    }
}
