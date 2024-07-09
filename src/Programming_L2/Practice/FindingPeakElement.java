package Programming_L2.Practice;

public class FindingPeakElement {
    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 6, 1, 2};
        int peak = find(arr);
        System.out.println(peak);
    }

    //    Finding Peak Element in Array using Binary Search
    //    Time Complexity - 0(n)
    public static int find(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]) {
                return arr[mid];
            }
            if (arr[mid] < arr[mid + 1]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return 0;
    }
}
