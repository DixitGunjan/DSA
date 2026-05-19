package org.leetcode.problems.arrays;

public class DietPlan {
    public static void main(String[] args) {
        int[] diet = {1,2,3,4,5};
        int days = 1;
        int lower = 3;
        int upper = 3;

        System.out.println(countDiet(diet, days, lower, upper));
    }

    private static int countDiet(int[] diet, int days, int lower, int upper) {
        int result = 0;
        int currCalories = 0;
        int start = 0;
        for (int i = 0; i < diet.length; i++) {
            currCalories += diet[i];
            if (i - start + 1 == days) {
                if (currCalories < lower) {
                    result--;
                } else if (currCalories > upper)
                    result++;

                currCalories -= diet[start++];
            }
        }
        return result;
    }
}
