package Round2.Assignment;

public class ConvertZerosToFives {
    public static void main(String[] args) {
        int num = 121;
        System.out.println(convertFives(num));
    }

    static int convertFives(int num) {
        int newNum = num;
        int ans = 0;
        int placeValue = 1;
        while (newNum != 0) {
            int digit = newNum % 10;
            if (digit == 0) {
                digit = 5;
            }
            ans += digit * placeValue;
            placeValue *= 10;
            newNum /= 10;
        }
        return ans;
    }
}
