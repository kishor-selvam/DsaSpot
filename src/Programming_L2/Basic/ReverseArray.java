package Programming_L2.Basic;

import java.util.*;


public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 5};
//        reverseArray(arr);
        reverseArrayTwoPoiner(arr);
    }

    // Bruteforce Approach
    // Time Complexity  - O(n)
    // Space Complexity - O(n)
    private static void reverseArray(int[] arr) {
        int[] newArr = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            newArr[arr.length - i - 1] = arr[i];
        }
        System.out.println("Original Array : " + Arrays.toString(arr));
        System.out.println("Reversed Array : " + Arrays.toString(newArr));
    }

    // Optimized Solution - Two Pointer
    // Time Complexity  - O(n)
    // Space Complexity - O(1)
    private static void reverseArrayTwoPoiner(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
        System.out.println(Arrays.toString(arr));
    }


}
