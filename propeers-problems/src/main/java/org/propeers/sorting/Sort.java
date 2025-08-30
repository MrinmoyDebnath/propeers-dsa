package org.propeers.sorting;

public class Sort {

    public static void bubbleSort(int[] arr, int n) {
        // Write your code here.
        for(int i=0; i<n-1; i++) {
            for(int j=i+1; j<n; j++) {
                if(arr[j]<arr[i]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
