package Programs.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SortArray {
    //Sort an Array: Sort an array of integers using Java Collections.

    public static void main(String[] args) {
        // TODO: Implement the solution for SortArray
        System.out.println("This is the SortArray class.");

        Integer[] arr = {5,3,7,2,9,11,6};
        //================================================================
        // Nirmal Code ++++++++++++++++++++++++++++++++++++++++++++++++++
        //================================================================
        List<Integer> list = Arrays.asList(arr);
        Collections.sort(list);
        System.out.println(list);

        //================================================================
        // Nirmal Code ++++++++++++++++++++++++++++++++++++++++++++++++++
        //================================================================

    }
}
