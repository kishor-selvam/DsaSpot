package Round2.Assignment;

public class FindLargestAndSecondLargestElement {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 3, 5, 5, 5};
        findFirstAndSecondLargest(arr);
    }

    static void findFirstAndSecondLargest(int[] arr) {
        int max = Integer.MIN_VALUE;
        int secondLargest = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > secondLargest && arr[i] < max) {
                secondLargest = arr[i];
            }
        }

        System.out.println(max + " " + secondLargest);
    }
}
