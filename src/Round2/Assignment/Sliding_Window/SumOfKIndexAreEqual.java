package Round2.Assignment.Sliding_Window;

import java.util.Arrays;

public class SumOfKIndexAreEqual {
    public static void main(String[] args) {
        int[] arr = {100,200, 300, 400};
        int target = 500;
        int k = 2;
        System.out.println(Arrays.toString(SumOfTargetK(arr, target, k)));
    }

    private static int[] SumOfTargetK(int[] arr, int target, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr[i];
            if (sum == target) {
                return new int[]{i - 1, i};
            }
        }

        for (int i = k; i < arr.length; i++) {
            sum = sum - arr[i - k] + arr[i];
            if (sum == target) {
                return new int[]{i - 1, i};
            }
        }
        return new int[]{-1, -1};
    }
}
