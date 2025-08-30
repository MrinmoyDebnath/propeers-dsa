package org.propeers.problems;

import java.util.HashSet;
import java.util.Set;

public class FirstMissing {
    public static int firstMissing(int[] arr, int n) {
        // Write your code here.
        int smallestPositive = -1;
        int biggest = -1;
        Set<Integer> positiveInts = new HashSet<>();
        for(int i=0; i<n; i++) {
            if(arr[i] > 0) {
                positiveInts.add(arr[i]);
                if(smallestPositive > arr[i] || smallestPositive == -1)
                    smallestPositive = arr[i];
                if(biggest < arr[i])    biggest = arr[i];
            }
        }
        if(smallestPositive != 1)   return 1;
        while(smallestPositive<=biggest) {
            if(!positiveInts.contains(smallestPositive))    return smallestPositive;
            smallestPositive++;
        }
        return smallestPositive;
    }
}
