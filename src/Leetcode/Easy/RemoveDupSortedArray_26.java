package Leetcode.Easy;

import java.util.Arrays;

public class RemoveDupSortedArray_26 {
    public static void main(String[] args) {
        int[] arr = {1,1,2};
        removeDup(arr);
    }

    static void removeDup(int[] arr) {
        int x = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[x]) {
                arr[++x] = arr[i];
            }
        }
        System.out.println(x);
        System.out.println(Arrays.toString(arr));
    }
}
