package Round2.Assignment.TwoPointer;

import java.util.Arrays;

public class TakeCount {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 0, 0, 1, 0, 1, 2, 2, 1, 2, 1};
        sortNum(arr);
    }

    private static void sortNum(int[] arr) {
        int zeros = 0;
        int ones = 0;
        int twos = 0;
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                zeros++;
            } else if (arr[i] == 1) {
                ones++;
            } else if (arr[i] == 2) {
                twos++;
            }
        }

        for (int i = 0; i < zeros; i++) {
            arr[k++] = 0;
        }
        for (int i = zeros; i < zeros + ones; i++) {
            arr[k++] = 1;
        }
        for (int i = zeros+ones; i < zeros + ones + twos; i++) {
            arr[k++] = 2;
        }

        System.out.println(Arrays.toString(arr));
    }
}
