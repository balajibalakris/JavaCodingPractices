package Programs.Arrays;
//Find Missing Number: Find the missing number in a sorted array using binary search.
public class MissingNumber {

    public static void main(String[] args) {
        // TODO: Implement the solution for MissingNumber
        System.out.println("This is the MissingNumber class.");
        //================================================================
        // Nirmal Code ++++++++++++++++++++++++++++++++++++++++++++++++++
        //================================================================

    int[] arr = {1, 2, 3, 5, 6};

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
    }
}
