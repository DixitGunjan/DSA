package org.tuf.arrays.mediumtab;


import java.util.ArrayList;

class SubArraySumEqualsTOTarget {
    static ArrayList<Integer> subarraySum(int[] arr, int target) {

        // Initialize window
        int s = 0;
        ArrayList<Integer> res = new ArrayList<>();

        int curr = 0;
        for (int end = 0; end < arr.length; end++) {
            curr += arr[end];

            if (curr > target && s < end) {
                curr -= arr[s];
                s++;
            }
            if (curr == target) {
                res.add(s);
                res.add(end);
                return res;
            }
        }


        // If no subarray is found
        if (res.isEmpty())
            res.add(-1);
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {15, 2, 4, 8, 9, 5, 10, 23};
        int target = 23;
        ArrayList<Integer> res = subarraySum(arr, target);

        for (int ele : res)
            System.out.print(ele + " ");
    }
}