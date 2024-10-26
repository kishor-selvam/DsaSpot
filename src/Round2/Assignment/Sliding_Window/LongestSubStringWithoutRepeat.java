package Round2.Assignment.Sliding_Window;

public class LongestSubStringWithoutRepeat {
    public static void main(String[] args) {
        String str = "abcczaceabc";
        System.out.println(longestSubstring(str));
    }

    static int longestSubstring(String s) {
        int n = s.length();
        int start = 0;
        int end = 0;
        int max = 0;
        int[] freq = new int[256];
        while (start < n) {
            int startIndex = s.charAt(start);
            if (freq[startIndex] > 0) {
                while (end < n) {
                    if (s.charAt(start) == s.charAt(end)) {
                        end++;
                        break;
                    }

                    int endIndex = s.charAt(end);
                    freq[endIndex]--;
                    end++;
                }
            } else {
                freq[startIndex]++;
                max = Math.max(max, start - end + 1);
            }

            start++;
        }
        return max;
    }
}
