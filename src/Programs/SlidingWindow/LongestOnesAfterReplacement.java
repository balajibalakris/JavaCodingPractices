package Programs.SlidingWindow;

import java.util.*;

public class LongestOnesAfterReplacement {

    public static void main(String[] args) {
        // TODO: Implement the solution for LongestOnesAfterReplacement
        System.out.println("This is the LongestOnesAfterReplacement class.");

        balajiLongestOnesAfterReplacement();
    }

    private static void balajiLongestOnesAfterReplacement() {

        int[] arr = {1, 0, 0, 1, 0, 1, 1, 0,1,1};

        //need to change only one 0 to 1 and find the lonng sequence of 1.
        int start = 0;
        int max = 0;
        int end ;
        int zeroCount = 0;

        for( end = 0; end < arr.length ; end++)
        {
            if(arr[end] == 0 )
            {
                zeroCount++;
            }

            while(zeroCount > 1)
            {
                if(arr[start] == 0 ) zeroCount--;
                start++;
            }

            max = Math.max(max,end-start +1);
        }


        System.out.print("[ ");
        for(int i = start ; i<max+start; i++)
        {
            System.out.print(arr[i] + ", ");
        }
        System.out.print("]");

    }
}
