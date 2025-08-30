package org.propeers.sorting;

import java.util.ArrayList;

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

    public static ArrayList<Integer> findArrayIntersection(ArrayList<Integer> arr1, int n, ArrayList<Integer> arr2, int m) {
        // Write Your Code Here.
        ArrayList result = new ArrayList();
        int i=0, j=0;
        while(i<n && j<m) {
            if (arr1.get(i) < arr2.get(j))  i++;
            else if (arr1.get(i) > arr2.get(j)) j++;
            else {
                result.add(arr1.get(i));
                i++;
                j++;
            }
        }
        return result;
    }
}
