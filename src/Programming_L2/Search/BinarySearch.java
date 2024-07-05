package Programming_L2.Search;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        binarySearch(arr);
    }

    //    Binary Search
    //    Time Complexity - O(log n)
    public static void binarySearch(int[] arr) {
        int target = 6;
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == target) {
                System.out.println(target + "- target is Available in " + mid);
                break;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            }
        }
    }
}
