package org.tuf.arrays.easytab;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        int tar = 1;

        for(int i: arr){
            if(i==tar){
                System.out.println("Found");
                break;
            }
        }
    }
}
