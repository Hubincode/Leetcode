package com.hubin.leetcode;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Solution_1403 {
    public List<Integer> minSubsequence(int[] nums) {
        Arrays.sort(nums);
        List<Integer> res=new LinkedList<Integer>();
        int sum=Arrays.stream(nums).sum(),sum2=0;
        int index=nums.length-1;
        while(sum2<=sum&&index>-1){
            sum-=nums[index];
            sum2+=nums[index];
            res.add(nums[index]);
            index--;
        }
        return res;

    }

}
