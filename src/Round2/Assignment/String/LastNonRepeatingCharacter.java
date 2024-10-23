package Round2.Assignment.String;

public class LastNonRepeatingCharacter {
    public static void main(String[] args) {
        String str = "abbcbdsss";
        lastNonRepeat(str);
    }

    static void lastNonRepeat(String s) {
        int[] freq = new int[26];
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
        }

        for (int i = s.length() - 1; i >= 0; i--) {
            char ch = s.charAt(i);
            if (freq[ch - 'a'] == 1) {
                System.out.println(ch);
                return;
            }
        }
    }
}
