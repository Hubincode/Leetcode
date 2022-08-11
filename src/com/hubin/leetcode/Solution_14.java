package com.hubin.leetcode;

public class Solution_14 {
    public String longestCommonPrefix(String[] strs) {
        int minIndex=0,minLen=200;
        for(int i=0;i<strs.length;i++){
            if(strs[i].length()<minLen){
                minLen=strs[i].length();
                minIndex=i;
            }
        }
        String res=strs[minIndex];
        int i,j;
        for(i=0;i<res.length();i++){
            for(j=0;j<strs.length;j++){
                if(strs[j].charAt(i)!=res.charAt(i)){
                    return res.substring(0,i);
                }
            }
        }
        return res;

    }
}
