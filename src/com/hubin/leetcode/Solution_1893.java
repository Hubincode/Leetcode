package com.hubin.leetcode;

import java.util.HashSet;
import java.util.Set;

public class Solution_1893 {
    public boolean isCovered(int[][] ranges, int left, int right) {
        boolean flag=true;
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<ranges.length;i++){
            for (int j=ranges[i][0];j<ranges[i][1]+1;j++){
                set.add(j);
            }
        }
        while(left<=right){
            if(!set.contains(left)){
                flag=false;
            }
            left++;
        }
        return flag;
    }
}
