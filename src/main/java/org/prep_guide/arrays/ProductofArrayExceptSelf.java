package org.prep_guide.arrays;

import java.util.Arrays;

public class ProductofArrayExceptSelf {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] arr2 = new int[arr.length];
        int product = 1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != 0){
                product *= arr[i];
            }
        }

        for(int i = 0; i < arr.length; i++){
            if(arr[i] != 0){
                int temp = product / arr[i];
                arr2[i] = temp;
            }else{
                arr2[i] = product;
            }
        }
        System.out.println(Arrays.toString(arr2));
    }
}
