package Programs.Strings;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstUniqueChar {

    public static void main(String[] args) {
        // TODO: Implement the solution for FirstUniqueChar
        System.out.println("This is the FirstUniqueChar class.");

        balajiFirstUniqCharacterCount();


    }

    private static void balajiFirstUniqCharacterCount() {

        String one = "balajib";
        String two = "aaeeiioou";

        long start1 = System.currentTimeMillis();


        Map<Character,Integer> freq = new LinkedHashMap<>();

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


        freq.entrySet().stream()
               .forEach(m -> System.out.println(m.getKey() + " : "+ m.getValue()));

        freq.entrySet().stream()
                .filter(m -> m.getValue() == 1)
                .findFirst()
                .ifPresent(m -> System.out.println(m.getKey()));

        System.out.println("timne is : " + (start1 - System.currentTimeMillis()));

        long start2 = System.currentTimeMillis();
        two.chars()
                .mapToObj(c -> (char)c)
                .collect(Collectors.groupingBy(
                        Function.identity(),Collectors.counting()
                )).entrySet().stream().filter(m -> m.getValue() == 1)
                .findFirst().ifPresent(m -> System.out.println(m.getKey()));
        System.out.println("timne is : " + (start2 - System.currentTimeMillis()));
    }
}
