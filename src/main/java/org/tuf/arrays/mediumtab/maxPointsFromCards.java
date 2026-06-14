package org.tuf.arrays.mediumtab;


//TODO:: Correct
public class maxPointsFromCards {
    void main() {
        int[] nums = {1, 2, 3, 4, 5, 6, 1};
        int cards = 3;
        System.out.println(maxPoints(nums, cards));
    }

    private int maxPoints(int[] nums, int cards) {
        if (cards > nums.length) return -1;
        int leftPoints = 0;
        int rightPoints = 0;

        int[] prefix = new int[nums.length];
        prefix[0] = nums[0];

        for (int i = 1; i < nums.length; i++) {
            prefix[i] = prefix[i - 1] + nums[i];
        }

        if (cards == nums.length) {
            return prefix[nums.length - 1];
        } else {
            leftPoints = prefix[cards];
            rightPoints = prefix[nums.length - 1] - prefix[nums.length - cards - 1];
            return Math.max(leftPoints, rightPoints);
        }


    }
}
