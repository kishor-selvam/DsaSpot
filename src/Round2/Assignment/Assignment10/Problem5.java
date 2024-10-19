package Round2.Assignment.Assignment10;

public class Problem5 {
    public static void main(String[] args) {
        String str = "Kishor";
        System.out.println(reverseVowels(str));
    }

    static char[] reverseVowels(String str) {
        char[] newArr = str.toCharArray();
        int low = 0;
        int high = newArr.length - 1;
        while (low <= high) {
            if (isVowel(newArr[low]) && isVowel(newArr[high])) {
                char temp = newArr[low];
                newArr[low] = newArr[high];
                newArr[high] = temp;
                low++;
                high--;
            } else if (isVowel(newArr[low]) && !isVowel(newArr[high])) {
                high--;
            } else low++;
        }
        return newArr;
    }

    static boolean isVowel(char ch) {
        if ((ch == 'A') || (ch == 'E') || (ch == 'I') || (ch == 'O') || (ch == 'U') || (ch == 'a') || (ch == 'e') || (ch == 'i') || (ch == 'o') || (ch == 'u')) {
            return true;
        }
        return false;
    }
}
