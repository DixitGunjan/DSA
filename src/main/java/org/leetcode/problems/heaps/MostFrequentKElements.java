package org.leetcode.problems.heaps;

import java.lang.reflect.Array;
import java.util.*;

public class MostFrequentKElements {

    void main() {
        int[] arr = {1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 1, 1, 1};
        int k = 2;
        System.out.println(Arrays.toString(mostFrequentKElements(arr, k)));
    }

    private int[] mostFrequentKElements(int[] arr, int k) {
        int[] result = new int[k];
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        for (int n : arr) {
            frequencyMap.put(n, frequencyMap.getOrDefault(n, 0) + 1);
        }

        PriorityQueue<Integer> queue = new PriorityQueue<>(Comparator.comparingInt(frequencyMap::get));

        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            queue.offer(entry.getKey());
            if (queue.size() > k) {
                queue.poll();
            }
        }
        for (int i = 0; i < k; i++) {
            if (!queue.isEmpty())
                result[i] = queue.poll();
        }
        return result;
    }
}
