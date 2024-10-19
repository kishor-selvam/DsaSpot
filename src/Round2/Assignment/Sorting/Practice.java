package Round2.Assignment.Sorting;

import java.util.Arrays;

public class Practice {
    public static void main(String[] args) {
        int[] arr = {2, 5, 4, 8, 1};
        int[] res = new int[arr.length];
        mergeSort(arr, res, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(res));
    }

    static void mergeSort(int[] arr, int[] res, int start, int end) {
        if (start == end) return;

        int mid = (start + end) / 2;
        mergeSort(arr, res, start, mid);
        mergeSort(arr, res, mid + 1, end);
        conquer(arr, res, start, mid, end);
    }

    static void conquer(int[] arr, int[] res, int start, int mid, int end) {
        int i = start;
        int j = mid + 1;
        int k = start;

        while (i <= mid && j <= end) {
            if (arr[i] <= arr[j]) {
                res[k++] = arr[i++];
            } else {
                res[k++] = arr[j++];
            }
        }

        while (i <= mid) {
            res[k++] = arr[i++];
        }
        while (j <= end) {
            res[k++] = arr[j++];
        }

        for (int l = start; l <= end; l++) {
            arr[l] = res[l];
        }
    }
}
