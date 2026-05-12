package org.tuf.arrays.easytab;

public class FindMissingNumber {
    public static void main(String[] args) {
        int[] arr1 = {0, 1, 2, 4, 5, 6};
        int n = arr1.length + 1;
        int sum = n * (n - 1) / 2;

        int sum2 = 0;
        for (int i : arr1) sum2 += i;
        System.out.println(sum - sum2);
    }
}
