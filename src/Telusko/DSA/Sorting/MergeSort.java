package Telusko.DSA.Sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {8, 5, 9, 1, 6, 7};
        System.out.println("Before Sort: " + Arrays.toString(arr));
        mergeSortFun(arr);
        System.out.println("After Sort:" + Arrays.toString(arr));

    }

    public static void mergeSortFun(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        divide(arr, left, right);
    }

    public static void divide(int[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            divide(arr, left, mid);
            divide(arr, mid + 1, right);
            merge(arr, mid, left, right);
        }
    }

    public static void merge(int[] arr, int mid, int left, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;
        int[] cpArr1 = new int[n1];
        int[] cpArr2 = new int[n2];

        for (int i = 0; i < n1; i++) {
            cpArr1[i] = arr[left + i];
        }
        for (int j = 0; j < n2; j++) {
            cpArr2[j] = arr[mid + 1 + j];
        }

        int i = 0;
        int j = 0;
        int k = left;

        while (i < n1 && j < n2) {
            if (cpArr1[i] <= cpArr2[j]) {
                arr[k] = cpArr1[i];
                i++;
            } else {
                arr[k] = cpArr2[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = cpArr1[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = cpArr2[j];
            j++;
            k++;
        }

    }
}
