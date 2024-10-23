package Round2.Assignment.String;

public class DecodingString {
    public static void main(String[] args) {
        String str = "a1b1c7";
        decodeString(str);
    }

    static void decodeString(String s) {
        int i = 0;
        String op = "";

        while (i < s.length()) {
            char currentChar = s.charAt(i);
            i++;

            String curNum = "";
            while (i < s.length() && Character.isDigit(s.charAt(i))) {
                curNum += s.charAt(i);
                i++;
            }

            int currentNum = Integer.parseInt(curNum);
            for (int j = 0; j < currentNum; j++) {
                op += currentChar;
            }
        }

        System.out.println(op);
    }
}
