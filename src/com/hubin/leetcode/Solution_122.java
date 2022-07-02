package com.hubin.leetcode;

import org.junit.Test;

public class Solution_122 {
    //动态规划
    public int maxProfit(int[] prices) {
        int res=0;
        int[][] dp=new int [prices.length][2];
        dp[0][0]=0;
        dp[0][1]=-prices[0];
        for(int i=1;i<prices.length;i++){
            dp[i][0]=Math.max(dp[i-1][0],dp[i-1][1]+prices[i]);
            dp[i][1]=Math.max(dp[i-1][1],dp[i-1][0]-prices[i]);
            res=Math.max(dp[i][0],res);
        }
        return res;
    }
    //贪心算法
    public int maxProfit2(int[] prices) {
        int[] chazhi=new int[prices.length];
        chazhi[0]=0;
        int res=0;
        for(int i=1;i<prices.length;i++){
            chazhi[i]=prices[i]-prices[i-1];
            if(chazhi[i]>0){
                res+=chazhi[i];
            }
        }
        return res;
    }
    @Test
    public  void test(){
        int[] prices = {1,2,3,4,5};
        Solution_122 solution_122=new Solution_122();
        System.out.println(solution_122.maxProfit(prices));
        System.out.println(solution_122.maxProfit2(prices));
    }
}
