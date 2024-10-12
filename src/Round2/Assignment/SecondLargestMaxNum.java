package Round2.Assignment;

public class SecondLargestMaxNum {
    public static void main(String[] args) {
        int[] arr = {3, 5, 8, 5, 1, 2, 9, 9, 9, 8, 7, 8};
        secondLargestNum(arr);
    }

    private static void secondLargestNum(int[] arr) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for (int i : arr) {
            if (i > max) {
                max = i;
            }
        }
        for (int l : arr) {
            if (l > secondMax && l < max) {
                secondMax = l;
            }
        }
        System.out.println("Largest Number :" + max);
        System.out.println("Second Largest Number :" + secondMax);
    }
}
