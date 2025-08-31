package org.propeers.problems;

public class SecondLargest {
    public static int findSecondLargest(int n, int[] arr) {
        // Write your code here.
        Integer largest = arr[0], secondLargest= null;
        for(int i=1; i<n; i++) {
            if(arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if(arr[i] != largest && (secondLargest==null || arr[i]>secondLargest)) {
                secondLargest = arr[i];
            }
        }
        return secondLargest == null ? -1 : secondLargest;
    }
}