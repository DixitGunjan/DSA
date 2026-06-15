package org.tuf.arrays.easytab;

import java.util.HashSet;
import java.util.Set;

public class FindFirstMissingPositive {
    void main() {
        int[] nums = {3, 4, 1, -1};
        System.out.println(firstMissingPositive(nums));
    }

    private int firstMissingPositive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        int expected = 1;

        while (set.contains(expected)) {
            expected++;
        }
        return expected;
    }
}
