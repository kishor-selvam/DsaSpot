package Round2.Assignment.String;

public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        String s = "aabccsbd";
        firstNonRepeat(s);
    }

    static void firstNonRepeat(String str) {
        int[] countArr = new int[26];
        for (int i = 0; i < str.length(); i++) {
            countArr[str.charAt(i) - 'a']++;
        }

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (countArr[ch - 'a'] == 1) {
                System.out.println(ch);
                return;
            }
        }

    }
}
