package org.propeers.problems;

public class EquilibriumArray {

    public static int arrayEquilibriumIndex(int[] arr) {
        int n = arr.length;
        if(n<=1)    return 0;
        for(int i=1; i<n; i++) {
            arr[i] = arr[i] + arr[i-1];
        }
        int i = 0;
        while(i<n) {
            if(i==0) {
                if(0 == arr[n-1]-arr[i])    return 0;
            }
            else if(arr[i-1] == arr[n-1] - arr[i])   return i;
            i++;
        }
        return -1;
    }
}
