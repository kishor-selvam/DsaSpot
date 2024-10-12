package Round2.Assignment;

public class SumofOdd {
    public static void main(String[] args) {
        int[] arr = {2, 4, 3, 6, 44, 7, 13};
        findOdd(arr);
    }

    public static void findOdd(int[] arr) {
        int len = arr.length;
        int sum = 0;
        for (int i = 0; i < len; i++) {
            if (arr[i] % 2 != 0) {
                sum += arr[i];
            }
        }
        System.out.println(sum);
    }
}
