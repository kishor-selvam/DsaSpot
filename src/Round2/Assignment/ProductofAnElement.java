package Round2.Assignment;
import java.util.*;

import java.lang.reflect.Array;

public class ProductofAnElement {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        productOfAnElement(arr);
    }

    private static void productOfAnElement(int[] arr) {
        int[] leftArr = new int[arr.length];
        int[] rightArr = new int[arr.length];
        leftArr[0] = 1;
        rightArr[arr.length - 1] = 1;
        for (int i = 1; i < arr.length; i++) {
            leftArr[i] = arr[i - 1] * leftArr[i - 1];
        }
        for (int i = arr.length - 2; i >= 0; i--) {
            rightArr[i] = arr[i + 1] * rightArr[i + 1];
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = leftArr[i] * rightArr[i];
        }

        System.out.println(Arrays.toString(arr));
    }
}
