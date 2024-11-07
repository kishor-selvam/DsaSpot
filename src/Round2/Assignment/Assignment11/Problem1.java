package Round2.Assignment.Assignment11;

import java.util.Arrays;

public class Problem1 {
    public static void main(String[] args) {
        int[] arr = {2, 0, 2, 1, 1, 0};
        System.out.println(Arrays.toString(sortingColor(arr)));
    }

    static int[] sortingColor(int[] arr) {
        int start = 0;
        int mid = 0;
        int end = arr.length - 1;
        while (mid <= end) {
            if (arr[mid] == 0) {
                swap(arr, mid, start);
                start++;
                mid++;
            } else if (arr[mid] == 2) {
                swap(arr, mid, end);
                end--;
            } else {
                mid++;
            }
        }
        return arr;
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
