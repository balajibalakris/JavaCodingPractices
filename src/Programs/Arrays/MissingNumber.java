package Programs.Arrays;

import java.util.Arrays;

//Find Missing Number: Find the missing number in a sorted array using binary search.
public class MissingNumber {

    public static void main(String[] args) {
        // TODO: Implement the solution for MissingNumber
        System.out.println("This is the MissingNumber class.");
        //================================================================
        // Nirmal Code ++++++++++++++++++++++++++++++++++++++++++++++++++
        //================================================================

    int[] arr = { 12, 13, 14,15, 16,17,18,19,20,22,23};

    int low = 0;
    int high = arr.length-1;
    for (int i=0;low<high;){
        int mid= (low+high)/2;
        if(arr[mid]-mid == arr[0]){
        low = mid+1;
        }else {
            high=mid - 1;
        }
    }
       System.out.println(arr[0]+low);




        //================================================================
        // Nirmal Code ++++++++++++++++++++++++++++++++++++++++++++++++++
        //================================================================





        balajiBinarySearch();




    }

    private static void balajiBinarySearch() {

        //so binary search works by assumption that given input is always sorted.
        //The Input array is divided into half and the number is then calculated whether in first half or second half.
        //this is repeated until value found.
        //. to find the code manually

        int[] arr = {23,24,25,26,28,29,30};

        int tempSum =0;
        //Brute Force Method :
        for(int x : arr)
        {
            tempSum = tempSum +x;
        }
        int actualSum = (((arr[arr.length-1] - arr[0]  + 1) *(arr[0]+arr[arr.length-1]))/2);
        System.out.println("The missing number is : "+( actualSum-tempSum));

        int low = 0;
        int high = arr.length -1;
        while (low < high)
        {
            int mid = (low +high)/2;
            if(arr[mid] - mid == arr[0])
            {
                low = mid +1;
            }
            else {
                high = mid -1;
            }
        }
        System.out.println(low + arr[0]);
    }


    //================================================================
    // Balaji Code ++++++++++++++++++++++++++++++++++++++++++++++++++
    //================================================================
}
