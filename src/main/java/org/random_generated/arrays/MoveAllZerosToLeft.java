package org.random_generated.arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MoveAllZerosToLeft {
    void main() {
        int[] nums = {1, 0, 0, 5, 0, 1};

        int zeroI = nums.length - 1;

        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[zeroI];
                nums[zeroI] = temp;
                zeroI--;
            }
        }
        Arrays.stream(nums).forEach(System.out::print);
    }
}
