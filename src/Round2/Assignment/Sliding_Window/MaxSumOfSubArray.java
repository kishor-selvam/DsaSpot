package Round2.Assignment.Sliding_Window;

public class MaxSumOfSubArray {
    public static void main(String[] args) {
        int[] arr = {2, 5, 1, 7, 8, 3, 4};
        int target = 3;
        maxSubArray(arr, target);
    }

    static void maxSubArray(int[] arr, int target) {
        int max = 0;
        int sum = 0;
        for (int i = 0; i < target; i++) {
            sum = sum + arr[i];
        }
        max = sum;
        for (int i = target; i < arr.length; i++) {
            sum = sum - arr[i - target] + arr[i];
            max = Math.max(max, sum);
        }
        System.out.println(max);
    }
}
