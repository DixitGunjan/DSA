package org.leetcode.problems.arrays;

public class ProductOfArrayExceptItself {

    //O(n2)
    public static int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            int product = 1;

            for (int j = 0; j < nums.length; j++) {

                if (i == j) continue;
                else {
                    product *= nums[j];
                }
                result[i] = product;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {-1, 1, 0, -3, 3};
        int[] result = productExceptSelf(arr);

        for (int i : result) {
            System.out.println(i);
        }
    }
}
