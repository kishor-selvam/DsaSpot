package Round2.Assignment;

public class FindLastIndexOfSortedArray {
    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 2, 2, 2, 3, 3, 3, 3, 4, 5, 5, 5, 5, 5, 6, 6, 6, 7, 8, 9};
        int target = 3;
        System.out.println(findLastIndex(arr, target));
    }

    static int findLastIndex(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] > target) {
                high = mid - 1;
            } else if (arr[mid] == target && arr[mid + 1] > target) {
                return mid;
            } else low = mid + 1;
        }
        return -1;
    }

}
