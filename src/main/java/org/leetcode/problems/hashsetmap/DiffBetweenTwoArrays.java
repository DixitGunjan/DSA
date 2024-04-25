package org.leetcode.problems.hashsetmap;

import java.util.*;
import java.util.stream.Collectors;

public class DiffBetweenTwoArrays {

    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {

        List<List<Integer>> resultList = new ArrayList<>();
        List<Integer> res1 = new ArrayList<>();
        List<Integer> res2 = new ArrayList<>();

        Set<Integer> set1 = Arrays.stream(nums1).boxed().collect(Collectors.toSet());//new HashSet<>();
        Set<Integer> set2 = Arrays.stream(nums2).boxed().collect(Collectors.toSet());

        set1.forEach(ele -> {
            if (!set2.contains(ele)) {
                res1.add(ele);
            }
        });

        set2.forEach(ele -> {
            if (!set1.contains(ele)) {
                res2.add(ele);
            }
        });
        resultList.add(res1);
        resultList.add(res2);

        return resultList;

    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {2, 4, 6};

        System.out.println(findDifference(arr1, arr2));
    }
}
