package Round2.Assignment;

import java.util.Arrays;

public class LeftRotate {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int rotate = 4;
        leftRotate(arr, rotate);

    }

    static void leftRotate(int[] arr, int rotate) {
        rotate = rotate % arr.length;
        reverse(arr, 0, arr.length - 1);
        reverse(arr, 0, arr.length - 1 - rotate);
        reverse(arr, arr.length - 1 - rotate + 1, arr.length-1);
        System.out.println(Arrays.toString(arr));

    }

    static void reverse(int[] arr, int i, int j) {
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}
