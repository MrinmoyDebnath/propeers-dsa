package org.propeers.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RotateArray {
    public static ArrayList<Integer> rotateArray(ArrayList<Integer> arr, int k) {
        int len = arr.size();
        k = k%len;
        reverseArrayAtIndex(arr, 0, k-1);
        reverseArrayAtIndex(arr, k, len-1);
        reverseArrayAtIndex(arr, 0, len-1);
        return arr;
    }

    public static void reverseArrayAtIndex(ArrayList<Integer> arr, int start, int end) {
        int i = start, j = end;
        while(i<j) {
            int front = arr.get(i);
            int back = arr.get(j);
            arr.set(i, back);
            arr.set(j, front);
            i++;
            j--;
        }
    }
}