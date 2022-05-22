package com.hubin.leetcode;
import java.util.Arrays;
public class Soultion_1877 {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int i=0;
        int max=0;
        while(i<nums.length/2){
            int sum=(nums[i]+nums[nums.length-1-i]);
            max=max>sum?max:sum;
            i++;
        }
        return max;
    }
}
