package Round2.Assignment;

public class FindFirstIndexOfSortedArray {
    public static void main(String[] args) {
//        int[] arr = {1, 1, 1, 2, 2, 3, 4, 5, 6};
        int[] arr = {1, 1, 1, 2, 2, 2, 3, 3, 3, 3, 4, 5, 5, 5, 5, 5, 6, 6, 6, 7, 8, 9};
        int target = 5;
        System.out.println(findFirstIndex(arr, target));
    }

    static int findFirstIndex(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {

            int mid = (left + right) / 2;
            if (arr[mid] < target) {
                left = mid + 1;
            } else if (arr[mid] == target && arr[mid - 1] < target) {
                return mid;
            } else right = mid - 1;
        }
        return -1;
    }

}
