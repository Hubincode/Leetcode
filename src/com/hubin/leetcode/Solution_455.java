package com.hubin.leetcode;

import java.util.Arrays;

public class Solution_455 {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int j=0,res=0;
        for(int i=0;i<s.length;i++){
            if(j>=g.length){
                break;
            }
            if ((g[j]-s[i])<=0){
                g[j]-=s[i];
                j++;
                res++;
            }
        }
        return res;
    }
}
