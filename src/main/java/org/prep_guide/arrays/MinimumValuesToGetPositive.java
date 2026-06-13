package org.prep_guide.arrays;

//LC1413
public class MinimumValuesToGetPositive {
    public static void main(String[] args) {
        int[] arr = {-3, 2, -3, 4, 2};
        System.out.println(minimumStartValue_BruteForce(arr));
        System.out.println(minimumStartValue_Optimal(arr));
    }

    private static int minimumStartValue_Optimal(int[] arr) {
        int currSum = 0;
        int minSum = 0;
        for (int j : arr) {
            currSum += j;
            minSum = Math.min(minSum, currSum);
        }
        //Condition was sum shudnt be less than 1, for n it will be  "n - minSum"
        return 1 - minSum;
    }

    private static int minimumStartValue_BruteForce(int[] nums) {
        int[] prefix = new int[nums.length];
        prefix[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            prefix[i] = prefix[i - 1] + nums[i];
        }
        boolean isLessThan1 = false;
        for (int i = 1; i < 2000; i++) {
            int j = 0;
            while (j < prefix.length) {
                if (i + prefix[j] < 1) {
                    isLessThan1 = true;
                    break;
                }
                j++;
            }
            if (!isLessThan1) {
                return i;
            }
            isLessThan1 = false;
        }
        return -1;



    }
}
