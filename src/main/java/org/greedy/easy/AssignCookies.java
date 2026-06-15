package org.greedy.easy;

import java.util.Arrays;

public class AssignCookies {
    void main() {
        int[] greed = {1, 2, 3};
        int[] size = {1, 1};

        System.out.println(countChildren(greed, size));
    }

    private int countChildren(int[] greed, int[] size) {
        int child = 0;
        int cookie = 0;

        Arrays.sort(greed);
        Arrays.sort(size);
        while (child < greed.length && cookie < size.length) {
            if (greed[child] <= size[cookie]) {
                child++;
            }
            cookie++;
        }
        return child;
    }
}
