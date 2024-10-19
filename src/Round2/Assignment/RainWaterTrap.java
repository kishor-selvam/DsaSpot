package Round2.Assignment;

public class RainWaterTrap {
    public static void main(String[] args) {
        int[] arr = {3, 1, 2, 4};
        int[] LeftHigh = highLefttoRight(arr);
        int[] RightHigh = findMaxRighttoLeft(arr);
        int totalTrap = findRainTrap(arr, LeftHigh, RightHigh);
        System.out.println(totalTrap);
    }

    static int findRainTrap(int[] arr, int[] left, int[] right) {
        int[] res = new int[arr.length];
        int count = 0;
        for (int i = 1; i < arr.length - 1; i++) {
            int min = Math.min(left[i], right[i]);
            res[i] = min - arr[i];
        }
        for (int i = 0; i < res.length; i++) {
            count += res[i];
        }
        return count;
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
}
