package Leetcode.Easy;

import java.util.Arrays;

public class TwoSum2_167 {
    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(arr, target)));
    }

    private static int[] twoSum(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            if ((arr[left] + arr[right]) > target) {
                right--;
            } else if ((arr[left] + arr[right]) < target) {
                left++;
            } else {
                return new int[]{left + 1, right + 1};
            }
        }
        return new int[]{-1, -1};

    }
}
