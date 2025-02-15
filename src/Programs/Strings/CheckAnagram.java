package Programs.Strings;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class CheckAnagram {

    public static void main(String[] args) {
        // TODO: Implement the solution for CheckAnagram
        System.out.println("This is the CheckAnagram class.");



        System.out.println("The word is anagaram : " +balajiAnagramCheck());
    }

    private static boolean balajiAnagramCheck() {

        String one = "silent";
        String two = "listen";

        boolean method1 = true;
        boolean method2 = true;

        if(one.length() != two.length()) return false;

        Map<Character,Integer> freq = new HashMap<>();

        for(int n = 0 ; n < one.length() ; n++ )
        {
            if(freq.containsKey(one.charAt(n)))
            {
                freq.put(one.charAt(n),freq.get(one.charAt(n))+1);
            }
            else {
                freq.put(one.charAt(n),1);
            }
        }

        for(char c : two.toCharArray())
        {
            if(freq.containsKey(c))
            {
                freq.put(c,freq.get(c)-1);
            }
        }

        for(int val : freq.values())
        {
            if(val < 0)
            {
                method1 =   false;
            }
        }

        //method 2 :
        HashMap<Character,Integer> s1 = new HashMap<>();
        HashMap<Character,Integer> s2 = new HashMap<>();


        for(int n = 0 ; n < one.length() ; n++)
        {
            if(s1.containsKey(one.charAt(n)))
            {
                s1.put(one.charAt(n),s1.get(one.charAt(n))+1);
            }
            else {
                s1.put(one.charAt(n),1);
            }
            if(s2.containsKey(one.charAt(n)))
            {
                s2.put(one.charAt(n),s2.get(one.charAt(n))+1);
            }
            else {
                s2.put(one.charAt(n),1);
            }
        }

        for(Map.Entry<Character,Integer> entry : s1.entrySet())
        {
            if(s2.get(entry.getKey()) != entry.getValue())
            {
                method2 = false;
            }
        }

        return method1 && method2;
    }
}
