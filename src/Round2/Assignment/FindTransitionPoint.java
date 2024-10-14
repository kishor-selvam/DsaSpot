package Round2.Assignment;

public class FindTransitionPoint {
    public static void main(String[] args) {
        int[] arr = {0, 0, 0, 0, 0};
        transitionPoint(arr);
    }

    static void transitionPoint(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = (start + end) / 2;
            if (arr[mid] < arr[mid + 1]) {
                System.out.println(mid + 1);
                break;
            } else if (arr[mid] == arr[mid + 1]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        System.out.println(-1);
    }
}
