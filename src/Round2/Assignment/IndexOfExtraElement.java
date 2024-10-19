package Round2.Assignment;

public class IndexOfExtraElement {
    public static void main(String[] args) {
        int[] arr1 = {3, 5, 7, 9, 11, 13};
        int[] arr2 = {3, 5, 7, 11, 13};
        System.out.println(optimizedSolution(arr1, arr2));
//        for (int i = 0; i < arr1.length; i++) {
//            if (arr1[i] != arr2[i]) {
//                System.out.println(i);
//                break;
//            }
//        }

    }

    static int optimizedSolution(int[] arr1, int[] arr2) {
        int low = 0;
        int high = arr2.length;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr1[mid] == arr2[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return arr1[low];
    }
}
