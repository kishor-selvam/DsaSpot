package Round2.Assignment;

public class SumofEvenOddValIndex {
    public static void main(String[] args) {
        int[] arr = {3, 8, 6, 5, 2, 12, 17};
        findEvenOddIndexVal(arr);
    }

    private static void findEvenOddIndexVal(int[] arr) {
        int len = arr.length;
        int evenSum = 0;
        int oddSum = 0;
        for (int i = 0; i < len; i++) {
            if (i % 2 == 0 && arr[i] % 2 == 0) {
                evenSum += arr[i];
            } else if (i % 2 != 0 && arr[i] % 2 != 0) {
                oddSum += arr[i];
            }
        }
        System.out.println("Sum of Odd Number in Odd Index :" + oddSum);
        System.out.println("Sum of Even Number in Even Index :" + evenSum);
    }
}
