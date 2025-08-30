package org.propeers.problems;

import java.util.ArrayList;

public class SumZerosMatrix {

    public static Integer coverageOfMatrix(ArrayList<ArrayList<Integer>> mat) {

        int m = mat.size();
        int n = mat.get(0).size();

        int coverage = 0;
        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                if(mat.get(i).get(j)==0) {
                    if(j-1>=0 && mat.get(i).get(j-1)==1) coverage++;
                    if(j+1<n && mat.get(i).get(j+1)==1) coverage++;
                    if(i-1>=0 && mat.get(i-1).get(j)==1) coverage++;
                    if(i+1<m && mat.get(i+1).get(j)==1) coverage++;
                }
            }
        }
        return coverage;
    }
}
