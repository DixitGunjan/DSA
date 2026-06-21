package org.random_generated.arrays;

public class RestaurantQueueBalancer {
    void main() {
        int[] nums = {4, 2, 2, 4};
        System.out.println(queueBalancer(nums));
    }

    private int queueBalancer(int[] nums) {

        int n = nums.length;

        // Edge case 1: Empty array
        if (n == 0) {
            return -1;  // Invalid
        }

        // Edge case 2: Single table (already balanced)
        if (n == 1) {
            return 0;
        }

        // Calculate total sum
        int totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }

        // Edge case 3: Not divisible
        if (totalSum % n != 0) {
            return -1;  // Not possible
        }

        int balance = totalSum / n;

        // Check if already balanced
        boolean alreadyBalanced = true;
        for (int num : nums) {
            if (num != balance) {
                alreadyBalanced = false;
                break;
            }
        }
        if (alreadyBalanced) {
            return 0;
        }

        // Calculate minimum operations using prefix sum of differences
        int operations = 0;
        int prefixDiff = 0;

        for (int num : nums) {
            prefixDiff += (num - balance);  // Cumulative excess/deficit
            operations += Math.abs(prefixDiff);  // Operations at this boundary
        }

        return operations;

    }
}
