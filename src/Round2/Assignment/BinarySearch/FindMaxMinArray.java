package Round2.Assignment.BinarySearch;

public class FindMaxMinArray {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 6, 7, 3, 2, 1};
        findMax(arr);
    }

    private static void findMax(int[] arr) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid - 1] < arr[mid] && arr[mid] < arr[mid + 1]) {
                low = mid + 1;
            } else if (arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]) {
                System.out.println(arr[mid]);
                return;
            } else {
                high = mid - 1;
            }
        }

    }
}
