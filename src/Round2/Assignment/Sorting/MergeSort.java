package Round2.Assignment.Sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 7, 5, 9, 1};
        int[] res = new int[arr.length];
        int start = 0;
        int end = arr.length - 1;
        divide(arr, res, start, end);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(res));
    }

    static void divide(int[] arr, int[] res, int start, int end) {
        if (start == end) {
            return;
        }
        int mid = (start + end) / 2;
        divide(arr, res, start, mid);
        divide(arr, res, mid + 1, end);
        conquer(arr, res, start, mid, end);
    }

    private static void conquer(int[] arr, int[] res, int start, int mid, int end) {
        int i = start;
        int j = mid + 1;
        int k = start;

        while (i <= mid && j <= end) {
            if (arr[i] <= arr[j]) {
//                int temp = arr[i];
//                arr[i] = arr[j];
//                arr[j] = temp;
                res[k] = arr[i];
                k++;
                i++;
            } else {
                res[k] = arr[j];
                k++;
                j++;
            }
        }

        while (i <= mid) {
            res[k] = arr[i];
            k++;
            i++;
        }
        while (j <= end) {
            res[k] = arr[j];
            k++;
            j++;
        }

        for (int l = start; l <= end; l++) {
            arr[l] = res[l];
        }
    }
}
