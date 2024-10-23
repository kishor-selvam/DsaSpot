package Round2.Assignment.String;

import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String str = "abbccbddddd";
        System.out.println(removeDuplicates(str));
    }

    static String removeDuplicates(String s) {
        int[] countArr = new int[26];
        String org = "";
        for (int i = 0; i < s.length(); i++) {
            countArr[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < countArr.length; i++) {
            if (countArr[i] >= 1) {
                char ch = (char) (i + 'a');
                org = org + ch;
            }
        }
        return org;
    }
}
