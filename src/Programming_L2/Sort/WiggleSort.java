package Programming_L2.Sort;

import java.util.Arrays;

public class WiggleSort {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 2, 3, 1};
        wiggleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void wiggleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (i % 2 == 0 && arr[i] > arr[i + 1]) {
                swap(arr, i, i + 1);
            } else if (i % 2 != 0 && arr[i] < arr[i + 1]) {
                swap(arr, i, i + 1);
            }
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
