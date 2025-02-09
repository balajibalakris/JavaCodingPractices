package Programs.Arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class KthLargest {
    //nd Kth Largest Element: Find the Kth largest element in an array using sorting.

    public static void main(String[] args) {
        // TODO: Implement the solution for KthLargest
        System.out.println("This is the KthLargest class.");
        Integer[] a = {5,3,7,2,9,11,6};
        //================================================================
        // Nirmal Code ++++++++++++++++++++++++++++++++++++++++++++++++++
        //================================================================
        int target = 2;
        Arrays.sort(a, Collections.reverseOrder());
        //System.out.println(Arrays.toString(a));

        //tried using collection :)
        Arrays.stream(a).skip(target-1).limit(1).forEach(x-> System.out.println(x));

        //easier way using index
        //System.out.println(a[target-1]);

        //================================================================
        // Nirmal Code ++++++++++++++++++++++++++++++++++++++++++++++++++
        //================================================================

        balajiCode(a);

    }

    private static void balajiCode(Integer[] a) {

        int target = 2;
        System.out.println("balaji code");
        for(int i = 0;i<a.length ; i ++)
        {
            for(int j = i ; j < a.length ; j++)
            {
                if(a[j] < a[i])
                {
                    a[i] = a[i] + a[j];
                    a[j] = a[i] - a[j];
                    a[i] = a[i] - a[j];
                }
            }
        }
        //System.out.println(a[a.length-target]);

        //Arrays.stream(a).forEach(System.out::print);
        Arrays.stream(a).skip(a.length-target).limit(1).forEach(System.out::println);

    }
}
