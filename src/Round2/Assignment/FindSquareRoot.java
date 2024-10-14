package Round2.Assignment;

public class FindSquareRoot {
    public static void main(String[] args) {
        int num = 5;
        System.out.println(finSquareRoot(num));
    }

    static int finSquareRoot(int target) {
        int start = 0;
        int end = target;
        int floor = 0;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (mid * mid == target) {
                return mid;
            } else if (mid * mid > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
                floor = mid;
            }
        }
        return floor;
    }
}
