package Round2.Assignment.Sliding_Window;

public class BinaryArrayToFindMaxSubArray {
    public static void main(String[] args) {
        int[] arr = {1, 0, 1, 0, 0, 0, 1, 1, 1};
        int k = 2;
        System.out.println(maxSubArrayBinary(arr, k));
    }

    static int maxSubArrayBinary(int[] arr, int k) {

        int left = 0;
        int right = 0;
        int max = 0;
        int zeroCount = 0;
        for (right = 0; right < arr.length; right++) {
            if (arr[right] == 0) {
                zeroCount++;
            }
            if (zeroCount > k) {
                while (zeroCount > k) {
                    if (arr[left] == 0) {
                        zeroCount--;
                    }
                    left++;
                }
            }
            max = Math.max(max, right - left + 1);
        }

        return max;
    }
}
