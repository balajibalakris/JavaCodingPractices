package Programs.Arrays;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class IntersectionArrays {
    //Intersection of Two Arrays: Find the intersection of two arrays.
    public static void main(String[] args) {
        // TODO: Implement the solution for IntersectionArrays
        System.out.println("This is the IntersectionArrays class.");
        //================================================================
        // Nirmal Code ++++++++++++++++++++++++++++++++++++++++++++++++++
        //================================================================
        Integer[] Array1 = {1, 2, 2, 3};
        Integer[] Array2 = {2, 2, 3, 4};

        Set<Integer> a = new HashSet<>();

        for (int i = 0; i < Array1.length; i++) {
            if(a.contains(Array1[i])){
                continue;
            }
            for (int j = 0; j < Array2.length; j++) {
                if(Objects.equals(Array1[i],Array2[j])){
                    a.add(Array1[i]);
                    break;
                }
            }
        }
        System.out.println(a);
        //================================================================
        // Nirmal Code ++++++++++++++++++++++++++++++++++++++++++++++++++
        //================================================================
    }
}
