package Round2.Assignment.TwoPointer;

import java.util.Arrays;

public class ReverseVowels {
    public static void main(String[] args) {
        String str = "rajesh";  // rejash
        reverseVowels(str);
    }

    static void reverseVowels(String str) {
        char[] chArr = str.toCharArray();
        int low = 0;
        int high = str.length() - 1;
        while (low < high) {
            if (isVowels(chArr[low]) && isVowels(chArr[high])) {
                char temp = chArr[low];
                chArr[low] = chArr[high];
                chArr[high] = temp;
                low++;
                high--;
            } else if (!isVowels(chArr[low])) {
                low++;
            } else {
                high--;
            }
        }
        System.out.println(chArr);
    }

    static boolean isVowels(char s) {
        if (s == 'a' || s == 'e' || s == 'i' || s == 'o' || s == 'u') {
            return true;
        } else if (s == 'A' || s == 'E' || s == 'I' || s == 'O' || s == 'U') {
            return true;
        }
        return false;
    }
}
