package Round2.Assignment.Recursion;

import java.util.HashSet;
import java.util.Set;

public class StringPermutation {
    public static void main(String[] args) {
        String s = "abc";
        Set<String> set = new HashSet<>();
        find("", s, set);
        System.out.println(set);
    }

    static void find(String word, String remaining, Set<String> set) {

        if (remaining.isEmpty()) {
            set.add(word);
            return;
        }

        for (int i = 0; i < remaining.length(); i++) {
            find(word + remaining.charAt(i), remaining.substring(0, i) + remaining.substring(i + 1), set);
        }
    }
}
