package Programs.Strings;

import java.util.Arrays;

public class LongestPrefix {

    public static void main(String[] args) {
        // TODO: Implement the solution for LongestPrefix
        System.out.println("This is the LongestPrefix class.");

        String[] words = {"apple", "app", "apricot"};

        int min = Arrays.stream(words)
                .mapToInt(String::length)
                .min()
                .orElse(0);
        int prefixLen = 0;

        for (int i = 0; i < min; i++) {
            char c = words[0].charAt(i);
            System.out.println("***" + c );
            int temp = 1;
            for (String word : words) {
                if (word.charAt(i) != c) {
                    temp = 0;
                    break;
                }
            }
            if (temp == 1) {
                prefixLen++;
            }

        }

        System.out.println(prefixLen);
    }
}
