package com.hubin.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Solution_986 {
    public  int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        if(firstList.length==0||secondList.length==0)
            return new int[0][];
        List<int[]> ans = new ArrayList();
        int i=0,j=0;
        while (i<firstList.length&&j<secondList.length){
            int left=Math.max(firstList[i][0],secondList[j][0]);
            int right=Math.min(firstList[i][1],secondList[j][1]);
            if(left<=right){
                    ans.add(new int[]{left,right});
            }
            if (firstList[i][1] < secondList[j][1])
                i++;
            else
                j++;
        }
        return ans.toArray(new int[ans.size()][]);
    }
}
