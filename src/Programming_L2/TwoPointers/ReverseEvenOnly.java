package Programming_L2.TwoPointers;

import java.util.Arrays;

public class ReverseEvenOnly {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        System.out.println("Original Array : " + Arrays.toString(arr));
        reverseEven(arr);
        System.out.println("Reversed Array : " + Arrays.toString(arr));

    }

    private static void reverseEven(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
//            if (end % 2 != 0) {
//                end--;
//            }
            swap(arr, start, end);
            start += 2;
            end -= 2;
        }
    }

    public static void swap(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }

}
