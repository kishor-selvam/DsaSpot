package Round2.Assignment;

import java.util.Arrays;

public class RotateAnArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int rotation = 3;
//        leftRotation(arr, rotation);
        rightRotation(arr, rotation);
    }

    private static void leftRotation(int[] arr, int rotation) {
        int times = rotation % arr.length;
        reverse(arr, 0, arr.length - 1);
        reverse(arr, 0, arr.length - 1 - times);
        reverse(arr, arr.length - 1 - times + 1, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    private static void rightRotation(int[] arr, int rotation) {
        rotation = rotation % arr.length;
        reverse(arr, 0, arr.length - 1);
        reverse(arr, 0, rotation - 1);
        reverse(arr, rotation, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    static void reverse(int[] arr, int low, int high) {
        while (low < high) {
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
    }
}
