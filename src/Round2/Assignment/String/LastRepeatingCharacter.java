package Round2.Assignment.String;

public class LastRepeatingCharacter {
    public static void main(String[] args) {
        String str = "bbcbassf";
        lastRepeat(str);
    }

    static void lastRepeat(String s) {
        int[] freq = new int[26];
        for (int i = s.length() - 1; i >= 0; i--) {
            freq[s.charAt(i) - 'a']++;
            if (freq[s.charAt(i) - 'a'] > 1) {
                System.out.println(s.charAt(i));
                return;
            }
        }
    }
}
