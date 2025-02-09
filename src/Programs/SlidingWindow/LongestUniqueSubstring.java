package Programs.SlidingWindow;

import java.util.HashSet;

public class LongestUniqueSubstring {

    public static void main(String[] args) {
        // TODO: Implement the solution for LongestUniqueSubstring
        System.out.println("This is the LongestUniqueSubstring class.");

        //balajiCode
        findLongestSubstringBalaji();
    }

    private static void findLongestSubstringBalaji() {
        //using Sliding window approach.
        String name = "balaji";

        int start = 0 ;
        int maxStart = 0;
        int maxLength  = 0;

        HashSet<Character> seen = new HashSet<Character>();

        for(int end = 0; end < name.length();end++)
        {
            char currentChar = name.charAt(end);
            while(seen.contains(currentChar))
            {
                seen.remove(name.charAt(start));
                start++;
            }
            seen.add(currentChar);
            if(end-start > maxLength)
            {
                maxLength = end -start +1;
                maxStart = start;
            }
        }

        System.out.println(name.substring(maxStart,maxStart+maxLength));
    }
}
