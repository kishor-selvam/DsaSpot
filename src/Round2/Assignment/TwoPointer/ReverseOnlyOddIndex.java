package Round2.Assignment.TwoPointer;

import java.util.Arrays;

public class ReverseOnlyOddIndex {
    public static void main(String[] args) {
        int[] arr = {2, 6, 4, 89, 7, 1, 23};
//        reverseOdd(arr);
        reverseEven(arr);
    }

    static void reverseOdd(int[] arr) {
        int low = 0;
        int high = arr.length - 1;
        while (low < high) {
            if (low % 2 != 0 && high % 2 != 0) {
                int temp = arr[low];
                arr[low] = arr[high];
                arr[high] = temp;
            }
            low++;
            high--;
        }
        System.out.println(Arrays.toString((arr)));
    }

    static void reverseEven(int[] arr) {
        int low = 0;
        int high = arr.length - 1;
        while (low < high) {
            if (low % 2 == 0 && high % 2 == 0) {
                int temp = arr[low];
                arr[low] = arr[high];
                arr[high] = temp;
            }
            low++;
            high--;
        }
        System.out.println(Arrays.toString((arr)));
    }
}
