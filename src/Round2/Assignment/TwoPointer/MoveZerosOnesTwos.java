package Round2.Assignment.TwoPointer;

import java.util.Arrays;

public class MoveZerosOnesTwos {
    public static void main(String[] args) {
        int[] arr = {0, 2, 1, 2, 0, 0};
        sortNum(arr);
    }

    static void sortNum(int[] arr) {
        int low = 0;
        int mid = 0;
        int high = arr.length - 1;
        while (mid <= high) {
            if (arr[mid] == 0) {
                swap(arr, low, mid);
                low++;
                mid++;
            } else if (arr[mid] == 1) {
                mid++;
            } else {
                swap(arr, mid, high);
                high--;
            }
        }

    }

    static void swap(int[] arr, int l, int r) {
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
    }
}
