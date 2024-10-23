package Round2.Assignment;

public class SunsetBuilding {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5};
        System.out.println(findSunset(arr));
    }

    static int findSunset(int[] arr) {
        int s = arr[0];
        int count = 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > s) {
                count++;
            }
        }
        return count;
    }
}
