package Programming_L2.Basic;

import java.util.Arrays;

public class FindSum {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 7, 9};
        int target = 10;
        int[] result = sumUsingTwoPointer(arr, target);
        System.out.println(Arrays.toString(result));
    }

    static int[] sumUsingTwoPointer(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int sum = arr[start] + arr[end];
            if (target == sum) {
                return new int[]{start, end};
            } else if (sum > target) {
                end--;
            } else {
                start++;
            }
        }
        return new int[]{-1, -1};
    }
}
