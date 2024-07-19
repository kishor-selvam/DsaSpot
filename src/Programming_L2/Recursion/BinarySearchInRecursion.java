package Programming_L2.Recursion;

public class BinarySearchInRecursion {
    public static void main(String[] args) {
        int target = 77;
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int start = 0;
        int end = arr.length - 1;
        int tarNum = recursionFun(arr, target, start, end);
        System.out.println(tarNum);
    }

    static int recursionFun(int[] arr, int target, int s, int e) {
        if (s > e) {
            return -1;
        }
        int mid = (s + e) / 2;
        if (arr[mid] == target) {
            return mid;
        } else if (arr[mid] < target) {
            recursionFun(arr, target, mid + 1, e);
        }
        return recursionFun(arr, target, s, mid - 1);
    }
}
