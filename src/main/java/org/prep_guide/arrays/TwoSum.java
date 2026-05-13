package org.prep_guide.arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        int[] arr = new int[]{3,2,4};
        int target = 6;
        //0(n^2)
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    list.add(i);
                    list.add(j);
                    break;
                }
            }
        }
        System.out.println(list);

        //o(n)
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int current = arr[i];
            int needed = target - current;
            if (map.containsKey(needed)) {
                System.out.println(map.get(needed) + "," + i);
            }
            map.put(current, i);
        }


    }
}
