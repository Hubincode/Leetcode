package com.hubin.leetcode;

public class Solution_55 {
    public boolean canJump(int[] nums) {
        boolean[] dp=new boolean[nums.length];
        for (int i=0;i<nums.length;i++){
            dp[i]=false;
        }
        dp[0]=true;

        for(int i=1;i<nums.length;i++){
            for(int j=0;j<i;j++){
                dp[i]=((j+nums[j])>=i)?dp[j]:false;
                if(dp[i]==true) break;
            }
        }
        return dp[nums.length-1];
    }
}
