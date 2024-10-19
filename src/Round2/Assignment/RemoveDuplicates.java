package Round2.Assignment;

import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 3, 3, 3, 3, 4, 5};
        findDup(arr);
    }

    static void findDup(int[] arr) {
        int j = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[j]) {
                arr[++j] = arr[i];
            }
        }
        System.out.println(j + 1);
        System.out.println(Arrays.toString(arr));
    }
}
