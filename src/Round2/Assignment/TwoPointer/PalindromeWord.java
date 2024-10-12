package Round2.Assignment.TwoPointer;

public class PalindromeWord {
    public static void main(String[] args) {
        String str = "I am a Programmer";
        String dubStr = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 32) {
                continue;
            }
            dubStr += Character.toLowerCase(str.charAt(i));

        }
        System.out.println(dubStr);
    }
}
