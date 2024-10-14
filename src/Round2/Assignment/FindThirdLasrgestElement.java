package Round2.Assignment;

import java.util.Scanner;

public class FindThirdLasrgestElement {
    public static void main(String[] args) {
        int[] arr = {1, 3, 0};
        System.out.println(findMax(arr));
    }

    static int findMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        int secondMax = 0;
        int thirdMax = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > secondMax && arr[i] < max) {
                secondMax = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > thirdMax && arr[i] < secondMax) {
                thirdMax = arr[i];
            }
        }
        return thirdMax;
    }
}
