package Programming_L2.TwoPointers;

import java.util.Arrays;

public class ReverseOddOnly {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        System.out.println("Original Array : " + Arrays.toString(arr));
        reverseOdd(arr);
        System.out.println("Reversed Array : " + Arrays.toString(arr));
    }

    //    Time Complexity - O(n)
    //    Space Complexity - O(1)
    public static void reverseOdd(int[] arr) {
        int start = 1;
        int end = arr.length - 1;
        while (start <= end) {
            if (end % 2 == 0) {
                end--;
            } else {
                swap(arr, start, end);
                start += 2;
                end -= 2;
            }
        }
    }

    public static void swap(int[] arr, int start, int end) {

        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
