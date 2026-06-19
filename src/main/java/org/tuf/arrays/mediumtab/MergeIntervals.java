package org.tuf.arrays.mediumtab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MergeIntervals {
    public static void main(String[] args) {
        int[][] intervals = new int[][]{{1, 4}, {2, 3}};
        Arrays.sort(intervals, (Comparator.comparingInt(r -> r[0])));

        int start = intervals[0][0];
        int end = intervals[0][1];
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 1; i < intervals.length; i++) {
            int tempStart = intervals[i][0];
            int tempEnd = intervals[i][1];

            // Check if overlapping
            if (tempStart <= end) {
                // Merge: update end to maximum of both ends
                end = Math.max(end, tempEnd); // Fixed: was missing Math.max [web:33][web:41]
            } else {
                // No overlap: add previous merged interval
                list.add(Arrays.asList(start, end));
                start = tempStart;
                end = tempEnd;
            }
        }

        // Add the last interval (fixed: was inside loop, should be after) [web:33][web:41]
        list.add(Arrays.asList(start, end));
        System.out.println(list);
    }
}
