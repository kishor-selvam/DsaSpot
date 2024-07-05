package Programming_L2.Practice;

import java.util.Arrays;

public class MoveZerosOnes {
    public static void main(String[] args) {
        int[] arr = {1, 1, 0, 0, 1, 1};
//        moveZerosLast(arr);
        moveZerosFirst(arr);
        System.out.println(Arrays.toString(arr));
    }

//    private static void moveZerosLast(int[] arr) {
//        int current = 0;
//        int last = arr.length - 1;
//        while (current < last) {
//            if (arr[current] == 0) {
//                swap(arr, current, last);
//                last--;
//            } else current++;
//        }
//    }

    public static void moveZerosFirst(int[] arr) {
        int current = 0;
        int zero = 0;
        while (current < arr.length - 1) {
            if (arr[current] == 0) {
                swap(arr, current, zero);
                zero++;
            } else current++;
        }
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
