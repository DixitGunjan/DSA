package org.prep_guide.arrays;

public class ContainerWithMostWater {

    public static void main(String[] args) {
        int[] arr = new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7};

        int left = 0;
        int right = arr.length - 1;
        int maxArea = 0;

        while (left < right) {
            int width = right - left;
            int height = Math.min(arr[left], arr[right]);
            int area = width * height;
            maxArea = Math.max(area, maxArea);

            if (arr[left] < arr[right]) {
                left++;
            } else {
                right--;
            }
        }
        System.out.println("maxArea = " + maxArea);
    }
}
