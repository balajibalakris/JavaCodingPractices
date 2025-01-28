package Programs.Arrays;

import java.util.Arrays;

public class MergeSortedArrays {
// Merge two sorted arrays into one sorted array
    public static void main(String[] args) {
        // TODO: Implement the solution for MergeSortedArrays
        System.out.println("This is the MergeSortedArrays class.");

        //================================================================
        // Nirmal Code ++++++++++++++++++++++++++++++++++++++++++++++++++
        //================================================================


        int[] a ={1,2,5,3};
        int[] b ={1,4,3,6};

        if (a == null || b == null) {
            System.out.println("Input arrays cannot be null.");
            return;
        }
        Arrays.sort(a);
        Arrays.sort(b);
        int[] res = new int[a.length+b.length];
        int count = 0;
        int i=0,j=0;
        for (;i<a.length && j<b.length;){
            if(a[i]==b[j]){
                res[count++]=a[i];
                res[count++]=b[j];
                i++;
                j++;
            } else if (a[i]<b[j]) {
                res[count++]=a[i];
                i++;
            }else  {
                res[count++]=b[j];
                j++;
            }
        }
        while(i!= a.length){
            res[count++]=a[i];
            i++;
        }
        while(j!= b.length){
            res[count++]=b[j];
            j++;
        }

        System.out.println(Arrays.toString(res));

        //================================================================
        // Nirmal Code ++++++++++++++++++++++++++++++++++++++++++++++++++
        //================================================================
    }
}
