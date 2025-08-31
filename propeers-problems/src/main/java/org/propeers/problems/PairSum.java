package org.propeers.problems;

import java.util.HashSet;
import java.util.Set;

public class PairSum {
    public static int pairSum(int arr[], int n, int target) {
        // Write your code here.
        Set<Integer> set = new HashSet<>();
        int result = 0;
        for(int i: arr) {
            if(set.contains(target - i) || set.contains(i))  result++;
            set.add(i);
            set.add(target-i);
        }
        return result > 0 ? result : -1;
    }
}
