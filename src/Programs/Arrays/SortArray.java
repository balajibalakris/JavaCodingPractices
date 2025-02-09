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
        //System.out.println(list);

        //================================================================
        // Nirmal Code ++++++++++++++++++++++++++++++++++++++++++++++++++
        //================================================================

        //using merge sort

        balajiMergeSort(arr);



    }

    private static void balajiMergeSort(Integer[] arr) {

        mergeSort(arr, 0,arr.length-1);

    }

    private static void mergeSort(Integer[] arr, int left, int right) {

        while (left<right)
        {
            int mid = left + (right-left)/2 ;
            mergeSort(arr,left,mid);
            mergeSort(arr,mid+1,right);
            merge(arr,left,mid,right);
        }

    }

    private static void merge(Integer[] arr, int left, int mid, int right) {

        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] leftArr = new int[n1];
        int[] rightArr = new int[n2];

        for (int i = 0; i < n1; i++) leftArr[i] = arr[left + i];
        for (int i = 0; i < n2; i++) rightArr[i] = arr[mid + 1 + i];

        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if (leftArr[i] <= rightArr[j]) {
                arr[k++] = leftArr[i++];
            } else {
                arr[k++] = rightArr[j++];
            }
        }

        while (i < n1) arr[k++] = leftArr[i++];
        while (j < n2) arr[k++] = rightArr[j++];

    }


}
