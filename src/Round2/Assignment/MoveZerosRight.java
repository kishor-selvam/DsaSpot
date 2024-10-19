package Round2.Assignment;

import java.util.Arrays;

public class MoveZerosRight {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 2, 0, 3, 0, 4};
//        myApproach(arr);
        OptimalApproach(arr);
    }

    static void myApproach(int[] arr) {
        int m = 1;
        int l = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[l] == 0 && arr[m] != 0) {
                int temp = arr[l];
                arr[l] = arr[m];
                arr[m] = temp;
                l++;
                m++;
            } else m++;
        }
        System.out.println(Arrays.toString(arr));
    }

    static void OptimalApproach(int[] arr) {
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[k] = arr[i];
                k++;
            }
        }

        while (k < arr.length) {
            arr[k++] = 0;
        }
        System.out.println(Arrays.toString(arr));
    }
}
