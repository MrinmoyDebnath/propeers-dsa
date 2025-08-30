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

    public static void selectionSort(int arr[], int n) {
        // Write your code here.
        for(int i=0; i<n-1; i++) {
            int minIndex = i;
            for(int j = i+1; j<n; j++) {
                if(arr[minIndex] > arr[j]) {
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }

    public static void insertionSort(int n , int[] arr) {
        // Write your code here.
        // as long as there are nos smaller than current in the earlier indexes, swap the current with the last occurence

        for(int i=0; i<n; i++) {
            int val = arr[i];
            int k = i;
            while(k>0 && val<arr[k-1]) {
                arr[k] = arr[k-1];
                k--;
            }
            arr[k] = val;
        }
    }
}
