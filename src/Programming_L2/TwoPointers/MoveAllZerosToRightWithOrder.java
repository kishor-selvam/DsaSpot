package Programming_L2.TwoPointers;

import java.util.Arrays;

public class MoveAllZerosToRightWithOrder {
    public static void main(String[] args) {
        int[] arr = {1, 4, 0, 0, 1, 0};
        moveAllZeros(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void moveAllZeros(int[] arr) {
        int left = 0, right = 0;
        while (right < arr.length) {
            if (arr[right] != 0) {
                swap(arr, left, right);
                left++;
            }
            right++;
        }
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
