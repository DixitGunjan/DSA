package org.random_generated.arrays;

public class MinimumJumps {
    public static void main(String[] args) {
        int[] arr = {9, 10, 1, 2, 3, 4, 8, 0, 0, 0, 0, 0, 0, 0, 1};
        System.out.println(minJumps(arr));
    }

    private static int minJumps(int[] arr) {
        if (arr.length <= 1) return 0;
        if (arr[0] == 0) return -1;

        int jumps = 0;
        int currentEnd = 0;  // End of current jump range
        int farthest = 0;    // Farthest reachable from current range

        for (int i = 0; i < arr.length - 1; i++) {
            farthest = Math.max(farthest, i + arr[i]);

            // Can't move forward
            if (farthest == i) return -1;

            // Reached end of current jump range → must jump
            if (i == currentEnd) {
                jumps++;
                currentEnd = farthest;

                // Can reach end already
                if (currentEnd >= arr.length - 1) return jumps;
            }
        }

        return -1;
    }
}
