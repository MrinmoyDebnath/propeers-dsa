package org.propeers.problems;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class MakeUniqueArray {
    public static int minElementsToRemove(ArrayList<Integer> arr) {
        // Write your code here
        Set<Integer> uniqueInts = new HashSet<>();
        int duplicates = 0;
        for(int i: arr) {
            if(uniqueInts.contains(i))  duplicates++;
            uniqueInts.add(i);
        }
        return duplicates;
    }
}
