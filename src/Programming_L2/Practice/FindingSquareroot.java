package Programming_L2.Practice;

public class FindingSquareroot {
    public static void main(String[] args) {
        int target = 23;
        int Sqrt = findSquareRoot(target);
        System.out.println(Sqrt);

    }

    static int findSquareRoot(int num) {
        int start = 0;
        int end = num;
        int result = 0;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (mid * mid == num) {
                return mid;
            }
            else if (mid * mid > num) {
                end = mid - 1;
            } else {
                start = mid + 1;
                result = mid;
            }
        }
        return result;
    }
}
