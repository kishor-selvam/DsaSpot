package Telusko.DSA.Sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {3, 6, 2, 1, 5};
        System.out.println("Before Sorting" + Arrays.toString(arr));
        insertionSort(arr);
        System.out.println("After Sorting" + Arrays.toString(arr));

    }

    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && key < arr[j] ) {
                arr[j + 1] = arr[j];
                j--; 
            }
            arr[j + 1] = key;
        }
    }
}
