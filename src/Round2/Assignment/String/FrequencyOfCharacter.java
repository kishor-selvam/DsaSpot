package Round2.Assignment.String;

import java.util.Arrays;

public class FrequencyOfCharacter {
    public static void main(String[] args) {
        String str = "aabsjhbfkjabccc";
        freqCharater(str);
    }

    static void freqCharater(String s) {
        int[] countArr = new int[26];
        for (int i = 0; i < s.length(); i++) {
            countArr[s.charAt(i) - 'a']++;
        }

        for (int i = 0; i < countArr.length; i++) {
            char ch = (char) (i + 'a');
            if (countArr[i] != 0) {
                System.out.println(ch + "--->" + countArr[i]);
            }
        }
    }
}
