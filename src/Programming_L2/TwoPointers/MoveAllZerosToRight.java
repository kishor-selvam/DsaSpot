package Programming_L2.TwoPointers;

import java.util.Arrays;

public class MoveAllZerosToRight {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4, 0, 5, 0, 0};
        moveAllZero(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void moveAllZero(int[] arr) {
        int current = 0;
        int lastIndex = arr.length - 1;
        while (current < lastIndex) {
            if (arr[current] == 0) {
                swap(arr, lastIndex, current);
                lastIndex--;
            } else
                current++;
        }
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
