package org.propeers.problems;

import java.util.ArrayList;

public class MoveZeroesToEnd {
    public static void pushZerosAtEnd(ArrayList<Integer> arr) {
        int i=0, j=0, n = arr.size();
        while(i<n) {
            if(arr.get(i)==0) i++;
            else {
                arr.set(j++, arr.get(i++));
            }
        }
        while(j<n) {
            arr.set(j++, 0);
        }
    }
}
