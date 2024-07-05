package Programming_L2.Search;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 2, 1, 7, 8};
        int target = 1;
        boolean isTarget = linearSearch(arr, target);
        System.out.println(isTarget ? target + " is available" : target + " is not available");
    }

    //    Linear Search
    //    Time Complexity - 0(n)
    private static boolean linearSearch(int[] arr, int target) {
        boolean isTarget = false;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == target) {
                isTarget = true;
            }
        }
        return isTarget;
    }
}
