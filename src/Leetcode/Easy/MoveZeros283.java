package Leetcode.Easy;

import java.util.Arrays;

public class MoveZeros283 {
    public static void main(String[] args) {
//        int[] arr = {1};
        int[] arr = {0, 1, 0, 3, 12};
//        moveZeros(arr);
        moveZeros1(arr);
    }

    static void moveZeros(int[] arr) {
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                int temp = arr[j];
                arr[j++] = arr[i];
                arr[i] = temp;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    static void moveZeros1(int[] arr) {
        int x = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[x++] = arr[i];
            }
        }

        for (int i = x; i < arr.length; i++) {
            arr[i] = 0;
        }
        System.out.println(Arrays.toString(arr));
    }
}
