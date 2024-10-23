package Round2.Assignment.String;

public class FirstRepeatingCharacter {
    public static void main(String[] args) {
        String str = "abcca";
        repeatCharacter(str);
    }

    static void repeatCharacter(String s) {
        int[] freq = new int[26];
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
            if (freq[s.charAt(i) - 'a'] > 1) {
                System.out.println(s.charAt(i));
                return;
            }
        }
    }
}
