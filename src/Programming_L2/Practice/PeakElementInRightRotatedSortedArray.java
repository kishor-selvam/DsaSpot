package Programming_L2.Practice;

public class PeakElementInRightRotatedSortedArray {
    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 6, 7, 1, 2};
        int peakElement = find(arr);
        System.out.println(peakElement);
    }

    static int find(int[] arr) {
        int start = 0;
        int end = arr.length;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid - 1] < arr[mid] && arr[mid] > arr[mid + 1]) {
                return arr[mid];
            } else if (arr[mid] < arr[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return 0;
    }
}
