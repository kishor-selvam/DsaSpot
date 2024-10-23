package Round2.Assignment.String;

public class EncodingOfString {
    public static void main(String[] args) {
        String str = "aabbbc";
        encodingString(str);
    }

    static void encodingString(String s) {
        int count = 1;
        char ch = s.charAt(0);
        String op = "";

        for (int i = 1; i < s.length(); i++) {
            ch = s.charAt(i);
            if (i + 1 != s.length() && s.charAt(i) == s.charAt(i + 1)) {
                count++;
            } else {
                op = op + ch + count;
                count = 1;
            }
        }
        System.out.println(op);
    }
}
