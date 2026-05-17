package org.tuf.arrays.mediumtab;

public class MaxConsecutivce1s {
    public static void main(String[] args) {
        int[] arr = {0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1};
        int k = 3;
        System.out.println(mc1(arr, k));
    }

    private static int mc1(int[] arr, int k) {
        int max = 0;
        int count = 0;
        int zeroc = 0;
        int zeroI = 0;
        int inversionCount = k;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i + 1] == 1) count++;
            if (arr[i + 1] == 0 && inversionCount > 0) {
                zeroc++;
                if (zeroc == 1) {
                    zeroI = i + 1;
                }
                arr[i + 1] = 1;
                inversionCount--;
                count++;
            } else {
                System.out.println("Inside else for i - "+i);
                inversionCount = k;
                max = Math.max(max, count);
                count = 0;
                i = zeroI;
                zeroc = 0;
                zeroI = 0;
            }
        }
        max = Math.max(max, count);
        return max;
    }
}
