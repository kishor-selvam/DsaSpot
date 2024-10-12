package Round2.Assignment.TwoPointer;

public class ValidPalindromeString {
    public static void main(String[] args) {
        String str = "abccba";
        System.out.println(validPalindrome(str));
    }

    public static boolean validPalindrome(String s) {
        int low = 0;
        int high = s.length() - 1;
        while (low < high) {
            if (s.charAt(low) != s.charAt(high)) {
                return false;
            }
            low++;
            high--;
        }
        return true;
    }
}
