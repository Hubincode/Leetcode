package com.hubin.leetcode;

import org.junit.Test;

import java.util.HashSet;

public class Solution_409 {
    public int longestPalindrome(String s) {
        if (s==null)
            return 0;
        int lenth=0;
        char[] chars=s.toCharArray();
        HashSet<Character> hashSet=new HashSet<>();
        for(int i=0;i<chars.length;i++){
            if(hashSet.contains(chars[i])){
                hashSet.remove(chars[i]);
                lenth++;
            }else {
                hashSet.add(chars[i]);
            }
        }
        if(hashSet.isEmpty())
            return lenth*2;
        else
            return lenth*2+1;
    }
    @Test
    public void test(){
        String s="a";
        Solution_409 solution_409=new Solution_409();
        System.out.println(solution_409.longestPalindrome(s));
    }
}
