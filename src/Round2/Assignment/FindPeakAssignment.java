package Round2.Assignment;

public class FindPeakAssignment {
    public static void main(String[] args) {
        int[] arr = {0,0,0};
        System.out.println(findPeak(arr));
    }

    static int findPeak(int[] arr) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] > arr[mid - 1] && arr[mid] < arr[mid + 1]) {
                low = mid + 1;
            } else if (arr[mid] < arr[mid - 1]) {
                high = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
