package Round2.Assignment.Recursion;

public class GenerateParenthesis {
    public static void main(String[] args) {
        find(2, "", 0, 0);
    }

    static void find(int n, String s, int open, int close) {

        if (s.length() == 2 * n) {
            System.out.println(s);
            return;
        }

        if (open < n)
            find(n, s + "(", open + 1, close);

        if (close < open)
            find(n, s + ")", open, close + 1);
    }
}
