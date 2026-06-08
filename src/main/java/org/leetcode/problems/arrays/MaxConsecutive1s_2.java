package org.leetcode.problems.arrays;

//LC-487
public class MaxConsecutive1s_2 {
    public static void main(String[] args) {
        int[] arr = {1, 0, 1, 1, 0};
        System.out.println(maxx1s(arr));
    }

    private static int maxx1s(int[] arr) {
        int left = 0;
        int zeroC = 0;
        int max = 0;

        for (int right = 0; right < arr.length; right++) {

            if (arr[right] == 0) {
                zeroC++;
            }

            while (zeroC > 1) {
                if (arr[left] == 0) {
                    zeroC--;
                }
                left++;

            }
            max = Math.max(max, right - left + 1);
        }
        return max;
    }
}
