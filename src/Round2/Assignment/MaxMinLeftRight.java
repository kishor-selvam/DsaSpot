package Round2.Assignment;

import java.util.Arrays;

public class MaxMinLeftRight {
    public static void main(String[] args) {
        int[] arr = {3, 4, 8, 2, 7};
//        System.out.println(findMin(arr));
//        System.out.println(Arrays.toString(highLefttoRight(arr)));
//        System.out.println(Arrays.toString(findMaxRighttoLeft(arr)));
        System.out.println(Arrays.toString(lowLefttoRight(arr)));
        System.out.println(Arrays.toString(lowRighttoLeft(arr)));
    }

    static int findMin(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    static int[] highLefttoRight(int[] arr) {
        int[] res = new int[arr.length];
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                res[i] = max;
            } else
                res[i] = max;
        }
        return res;
    }

    static int[] findMaxRighttoLeft(int[] arr) {
        int[] res = new int[arr.length];
        int max = arr[arr.length - 1];
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] > max) {
                max = arr[i];
                res[i] = max;
            } else
                res[i] = max;
        }
        return res;
    }

    static int[] lowLefttoRight(int[] arr) {
        int[] res = new int[arr.length];
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                res[i] = min;
            } else
                res[i] = min;
        }
        return res;
    }

    static int[] lowRighttoLeft(int[] arr) {
        int[] res = new int[arr.length];
        int min = arr[arr.length - 1];
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] < min) {
                min = arr[i];
                res[i] = min;
            } else
                res[i] = min;
        }
        return res;
    }
}
