package com.hubin.leetcode;

import org.junit.Test;

public class Solution_121 {
    public int maxProfit(int[] prices) {
        if (prices.length<1) return 0;
        int[][] dp=new int[prices.length][2];
        dp[0][0]=0;
        dp[0][1]-=prices[0];
        int max=0;
        for(int i=1;i<prices.length;i++){
            dp[i][0]=Math.max(dp[i-1][0],dp[i-1][1]+prices[i]);
            dp[i][1]=Math.max(dp[i-1][1],-prices[i]);
        }
        return dp[dp.length-1][0];
    }
    @Test
    public void test(){
        int[] prices={7,1,5,3,6,4};
        System.out.println(this.maxProfit(prices));
    }
}
