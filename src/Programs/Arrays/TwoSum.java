package Programs.Arrays;

import java.util.Arrays;

public class TwoSum {

    public static void main(String[] args) {
        // TODO: Implement the solution for TwoSum

        //================================================================
        // Balaji Code ++++++++++++++++++++++++++++++++++++++++++++++++++
        //================================================================
        // In a Given array find the two numbers that add up to the given target.

        int[] arr = {1,4,5,2,4,5,7,8,9,9,2,1,3};
        int target = 17;

        Arrays.sort(arr);

        for(int i =0,j = arr.length - 1; i < j;)
        {
            int tempTarget = arr[i] + arr[j];
            if(tempTarget == target)
            {
                System.out.println("the numbers are : " + arr[i] + " : "+arr[j]);
                break;
            }
            else {
                if(tempTarget < target)
                {
                    i++;
                }
                else {
                    j--;
                }
            }
        }


        //================================================================
        // Balaji Code ++++++++++++++++++++++++++++++++++++++++++++++++++
        //================================================================
        
    }
}
