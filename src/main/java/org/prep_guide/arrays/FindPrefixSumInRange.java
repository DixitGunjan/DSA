package org.prep_guide.arrays;

public class FindPrefixSumInRange {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(findSumInRange(arr, 0, 4));
    }

    private static int findSumInRange(int[] arr, int left, int right) {
        int[] prefixSum = createPrefixSum(arr);
        if (left == 0) {
            return prefixSum[right];
        }
        return prefixSum[right] - prefixSum[left - 1];
    }

    private static int[] createPrefixSum(int[] arr) {
        int[] prefixSum = new int[arr.length];
        prefixSum[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            prefixSum[i] = prefixSum[i - 1] + arr[i];
        }
        return prefixSum;
    }
}
