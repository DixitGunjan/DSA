package org.tuf.arrays.mediumtab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeadersInArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 3, 1, 2};
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            int tempL = arr[i];
            boolean isLeader = true;
            for (int j = i + 1; j < arr.length; j++) {
                if (tempL <= arr[j]) {
                    isLeader = false;
                    break;
                }
            }
            if (isLeader) {
                list.add(tempL);
            }
        }
        System.out.println(list);

        //Solution2
        int currL = arr[arr.length-1];
        list.clear();;
        list.add(currL);
        for(int i = arr.length-2; i >= 0; i--){
            if(arr[i] > currL){
                currL = arr[i];
                list.add(currL);
            }
        }
        System.out.println(list.reversed());
    }
}
