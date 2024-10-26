package Round2.Assignment.Sliding_Window;

public class MaxProductOfSubArray {
    public static void main(String[] args) {
        int[] arr = {-1, 0, 1};
        int k = 3;
        System.out.println(productSubArray(arr, k));
    }

    private static int productSubArray(int[] arr, int k) {
        int max = -1;
        int maxProduct = 1;
        for (int i = 0; i < k; i++) {
            maxProduct = maxProduct * arr[i];
        }
        max = maxProduct;

        for (int i = k; i < arr.length; i++) {
            maxProduct = (maxProduct / arr[i - k]) * arr[i];
            max = Math.max(max, maxProduct);
        }
        return max;
    }
}
