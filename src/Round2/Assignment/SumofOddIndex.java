package Round2.Assignment;

public class SumofOddIndex {
    public static void main(String[] args) {
        int[] arr = {2, 5, 8, 4, 2, 5, 12};
        findOddIndex(arr);
    }

    private static void findOddIndex(int[] arr) {
        int len = arr.length;
        int sum = 0;
        for (int i = 0; i < len; i++) {
            if (i % 2 != 0) {
                sum += arr[i];
            }
        }
        System.out.println(sum);
    }
}
