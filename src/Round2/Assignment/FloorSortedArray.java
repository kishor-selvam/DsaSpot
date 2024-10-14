package Round2.Assignment;

public class FloorSortedArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 8, 10, 11, 12, 19};
        int x = 8;
        System.out.println(findNearSqRoot(arr, x));
    }

    static int findNearSqRoot(int[] arr, int x) {
        int low = 0;
        int high = arr.length - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == x) {
                return mid;
            } else if (arr[mid] > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
                result = mid;
            }
        }
        return result;
    }
}
