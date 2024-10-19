package Round2.Assignment;

public class Main {
    public static void main(String[] args) {
        int[] a = {2, 4, 6, 8, 9, 10, 12};
        int[] b = {2, 4, 6, 8, 10, 12};
        System.out.println(findExtraElement(a, b));
    }

    static int findExtraElement(int[] arr1, int[] arr2) {
        int left = 0;
        int right = arr1.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr1[mid] == arr2[mid]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return arr1[left];
    }
}
