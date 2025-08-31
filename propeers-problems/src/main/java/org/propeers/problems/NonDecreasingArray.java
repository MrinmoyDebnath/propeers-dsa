package org.propeers.problems;

public class NonDecreasingArray {
    public static boolean isPossible(int[] arr, int n) {
        // Write your code here.
        int violations = 0, violationIndex = 0;
        for(int i=0; i<n-1; i++) {
            if(arr[i] > arr[i+1]) {
                violations++;
                violationIndex = i;
            }
            if(violations > 1)  return false;
        }
        boolean canModifyLeft = true, canModifyRight = true;
        if(violationIndex > 0 && arr[violationIndex-1] > arr[violationIndex+1]) canModifyLeft = false;
        if(violationIndex + 2 < n && arr[violationIndex] > arr[violationIndex+2]) canModifyRight = false;
        return canModifyLeft || canModifyRight;
    }
}