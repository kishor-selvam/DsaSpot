package Round2.Assignment.Assignment11;

//Goal Parser
public class Problem2 {
    public static void main(String[] args) {
        String str = "(al)G(al)()()G";
        goalParser(str);
    }

    static void goalParser(String s) {
        String op = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'G') {
                op += s.charAt(i);
            } else if (s.charAt(i) == 40 && s.charAt(i + 1) == 41) {
                op += "o";
                i++;
            } else {
                op += "al";
                i += 3;
            }
        }
        System.out.println(op);
    }
}
