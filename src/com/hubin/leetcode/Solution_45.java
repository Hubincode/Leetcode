package com.hubin.leetcode;

import org.junit.Test;

public class Solution_45 {
    public int jump(int[] nums) {
        /*
           动态规划
         */
        if(nums.length<1){
            return 0;
        }
        int[] dp=new int[nums.length];
        dp[0]=0;
        for(int i=1;i<nums.length;i++){
            int j=i-1;
            int min= nums.length-1;
            for(;j>=0;j--) {
                if (((i - j) <= nums[j]))
                    min = Math.min(j, min);
            }
            dp[i]=dp[min]+1;
        }
        return  dp[dp.length-1];
    }
    public int jump2(int[] nums) {
        /*
           贪心算法
         */
        int length = nums.length;
        int end = 0;
        int maxPosition = 0;
        int steps = 0;
        for (int i = 0; i < length - 1; i++) {
            maxPosition = Math.max(maxPosition, i + nums[i]);
            if (i == end) {
                end = maxPosition;
                steps++;
                }
            }
            return steps;

    }
    public static void main(String[] args) {
        int[] nums ={3,2,1};
        Solution_45 solution_45=new Solution_45();
        System.out.println(solution_45.jump(nums));
        System.out.println(solution_45.jump2(nums));
    }
}
