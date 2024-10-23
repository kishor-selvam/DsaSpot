package Round2.Assignment.String;

public class MaxOccuranceOfCharacter {
    public static void main(String[] args) {
        String str = "abcbcccbcbcnbwdfcxsc";
        maxOccurance(str);
    }

    static void maxOccurance(String str) {

        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("Empty String");
        }

        int[] countArr = new int[26];
        int max = 0;
        char maxCh = ' ';
        for (int i = 0; i < str.length(); i++) {
            countArr[str.charAt(i) - 'a']++;
        }

        for (int i = 0; i < countArr.length; i++) {
            if (countArr[i] != 0 && countArr[i] > max) {
                max = countArr[i];
                maxCh = (char) (i + 'a');
            }
        }

        System.out.println(maxCh+"--->"+max);
    }
}
