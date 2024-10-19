package Round2.Assignment.Assignment10;

import java.util.Arrays;

public class Problem2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] res = new int[arr.length];
        divide(arr, 0, arr.length - 1, res);
        System.out.println(Arrays.toString(arr));
    }

    static void divide(int[] arr, int start, int end, int[] res) {
        if (start == end) return;

        int mid = (start + end) / 2;
        divide(arr, start, mid, res);
        divide(arr, mid + 1, end, res);
        merge(arr, start, mid, end, res);
    }

    private static void merge(int[] arr, int start, int mid, int end, int[] res) {
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
