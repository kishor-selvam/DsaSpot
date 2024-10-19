package Round2.Assignment.Assignment10;

import java.util.Arrays;

public class Problem4 {
    public static void main(String[] args) {
        int[] arr = {5, 7, 7, 8, 8, 10};
        int target = 5;
        System.out.println(Arrays.toString(new int[]{findFirst(arr, target), (findLast(arr, target))}));
    }

    static int findFirst(int[] arr, int tar) {
        int low = 0;
        int high = arr.length - 1;
        int res = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == tar) {
                res = mid;
                high = mid - 1;
            } else if (arr[mid] < tar) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return res;
    }

    static int findLast(int[] arr, int tar) {
        int low = 0;
        int high = arr.length - 1;
        int res = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == tar) {
                res = mid;
                low = mid + 1;
            } else if (arr[mid] < tar) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
}
