package Programming_L2.TwoPointers;

import java.util.Arrays;

public class MoveZerosOnesTwos {
    public static void main(String[] args) {
        int[] arr = {2, 1, 1, 0, 2, 1, 0, 0, 2, 1};
        moveZerosandTwos(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void moveZerosandTwos(int[] arr) {
        int current = 0;
        int zeroIndex = 0;
        int twosIndex = arr.length - 1;
        while (current <= twosIndex) {
            if (arr[current] == 0) {
                swap(arr, zeroIndex, current);
                zeroIndex++;
            } else if (arr[current] == 2) {
                swap(arr, twosIndex, current);
                twosIndex--;

            } else {
                current++;
            }
        }
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
