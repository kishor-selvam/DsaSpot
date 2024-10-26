package Round2.Assignment.Sliding_Window;

public class MaxVowelsInSubString {
    public static void main(String[] args) {
        String str = "kisaehor";
        int target = 3;
        maxVowelsInSubString(str, target);
    }

    static void maxVowelsInSubString(String str, int target) {
        String vowels = "aeiou";
        int maxWindow = 0;
        int max = 0;
        for (int i = 0; i < target; i++) {
            if (vowels.indexOf(str.charAt(i)) != -1) {
                max++;
            }
        }
        maxWindow = max;
        for (int i = target; i < str.length(); i++) {
            if (vowels.indexOf(str.charAt(i - target)) == -1) {
                max--;
            }
            if (vowels.indexOf(str.charAt(i)) != -1) {
                max++;
            }
            maxWindow = Math.max(maxWindow, max);
        }

        System.out.println(maxWindow);
    }
}
