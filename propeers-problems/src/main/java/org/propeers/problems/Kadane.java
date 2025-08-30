package org.propeers.problems;

public class Kadane {
    public static long maxSubarraySum(int[] arr, int n) {
        long ans = arr[0];
        long curr = 0;
        for(int i=0; i<n; i++) {
            curr += arr[i];
            if(ans<curr)    ans = curr;
            if(curr<0)  curr = 0;
        }
        return ans > 0 ? ans : 0;
    }
}
