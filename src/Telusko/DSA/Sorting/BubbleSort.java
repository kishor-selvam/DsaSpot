package Telusko.DSA.Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {6, 5, 2, 8, 9, 4};

        System.out.println("Before Sort:" + Arrays.toString(arr));
        sortLogic(arr);
        System.out.println("After Sort:" + Arrays.toString(arr));

    }

    public static void sortLogic(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j+1);
                }
            }
            
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
