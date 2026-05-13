package org.tuf.arrays.mediumtab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MergeIntervals {
    public static void main(String[] args) {
        int[][] intervals = new int[][]{{4, 7}, {1, 4}};
        Arrays.sort(intervals, (Comparator.comparingInt(r -> r[0])));

        int start = intervals[0][0];
        int end = intervals[0][1];
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 1; i < intervals.length; i++) {
            int tempStart = intervals[i][0];
            int tempEnd = intervals[i][1];
            if (tempStart <= end) {
                end = tempEnd;
            } else {
                list.add(new ArrayList<>(Arrays.asList(start, end)));
                start = tempStart;
                end = tempEnd;
            }

            if (i == intervals.length - 1) {
                list.add(Arrays.asList(start, tempEnd));
            }
        }
        System.out.println(list);
    }
}
