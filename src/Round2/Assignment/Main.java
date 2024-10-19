package Round2.Assignment;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] arr = {3, 0, 1};
        System.out.println(missingNumber(arr));
    }

    public static int missingNumber(int[] nums) {
        int num = nums.length;
        System.out.println(num);
        int sum = (num * (num + 1)) / 2;
        System.out.println(sum);
        int totalSumofArr = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        return sum - totalSumofArr;

    }

//    static void rotate(int[] arr, int tar) {
//        tar = tar % arr.length;
//        reverse(arr, 0, arr.length - 1);
//        reverse(arr, tar, arr.length - 1);
//        reverse(arr, 0, tar - 1);
//    }
//
//    static void reverse(int[] arr, int start, int end) {
//        while (start <= end) {
//            int temp = arr[start];
//            arr[start] = arr[end];
//            arr[end] = temp;
//            start++;
//            end--;
//        }
//    }


}
