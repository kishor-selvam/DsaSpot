package Round2.Assignment.String;

public class StringIsAnagramOrNot {
    public static void main(String[] args) {
        String str = "eat";
        String str1 = "ate";
        if (checkAnagram(str, str1)) {
            System.out.println("Anagram");
        } else System.out.println("not Anagram");
    }

    static boolean checkAnagram(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        int[] countArr = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            countArr[s1.charAt(i) - 'a']++;
        }
        for (int i = 0; i < s2.length(); i++) {
            countArr[s2.charAt(i) - 'a']--;
        }
        for (int i = 0; i < countArr.length; i++) {
            if (countArr[i] != 0) {
                return false;
            }
        }
        return true;
    }
}
