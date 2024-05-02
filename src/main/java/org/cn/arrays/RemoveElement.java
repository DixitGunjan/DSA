package org.cn.arrays;

public class RemoveElement {

    public static int removeElement(int[] nums, int val) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {0,1,2,2,3,0,4,2};
        System.out.println(removeElement(arr, 2));
    }
}
