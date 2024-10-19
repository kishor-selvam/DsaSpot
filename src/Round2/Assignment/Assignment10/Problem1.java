package Round2.Assignment.Assignment10;

public class Problem1 {
    public static void main(String[] args) {
        String str = "c2b1x5";
        printAll(str);
    }

    static void printAll(String s) {
        int i = 0;
        String res = "";

        while (i < s.length()) {
            char curChar = s.charAt(i);
            i++;

            String numCh = "";
            while (i < s.length() && Character.isDigit(s.charAt(i))) {
                numCh += s.charAt(i);
                i++;
            }

            int countOfNum = Integer.parseInt(numCh);
            for (int j = 0; j < countOfNum; j++) {
                res += curChar;
            }
        }
        System.out.println(res);

    }
}
