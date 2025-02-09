package Programs.SlidingWindow;

public class SmallestSubarrayGreaterSum {

    public static void main(String[] args) {
        // TODO: Implement the solution for SmallestSubarrayGreaterSum
        System.out.println("This is the SmallestSubarrayGreaterSum class.");

        //Problem: Given an array, find the maximum sum of any subarray of size K.
        //🔹 Example: arr = [2, 1, 5, 1, 3, 2], K = 3 → Output: 9 ([5,1,3])
        //💡 Approach: Keep a window of size K, sliding it forward and updating the sum.

        balajiSWCode();
    }

    private static void balajiSWCode() {

        int[] arr = {2, 1, 5, 1, 3, 2,9,9};

        int k = 3;

        int maxSum = 0;
        int tempSum = 0;
        int start = 0;
        for(int i = 0 ; i<k ; i++)
        {
            tempSum = tempSum + arr[i];
        }

        maxSum = tempSum;

        for(int end = k;end < arr.length ; end++)
        {
            tempSum = tempSum + arr[end];
            tempSum = tempSum - arr[start];
            start++;

            maxSum = Math.max(maxSum,tempSum);
        }

        System.out.println("maxSum is  : "+ maxSum);
    }
}
