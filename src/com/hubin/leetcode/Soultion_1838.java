package com.hubin.leetcode;

import org.junit.Test;

import java.util.Arrays;

public class Soultion_1838 {
    public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
//        int res=0;
//        int i=0;
//        int sum=0;
//        while (i<nums.length&&((nums[i]*(i+1))-sum-nums[i])<=k) {
//            sum=sum+nums[i];
//            i++;
//        }
//
////        if(i<nums.length&&((nums[i]*(i+1))-sum)<=k){
////            i++;
////            while(i+1<nums.length&&nums[i+1]==nums[i]){
////                i++;
////            }
////        }
//        i--;
//        while(((i+1)<nums.length)&&nums[i]==nums[i+1]){
//            i++;
//        }
//        return i;
        int left=0,right=0,window=0,count=0;

        while(right<nums.length){
            int max=nums[right];
            window+=nums[right];
            count=right-left+1;
            right++;
            if((max*count-window)>k){
                window -= nums[left];
                left++;
            }
        }
        return right-left;
    }
    @Test
    public void test(){
        int[] nums={9930,9923,9983,9997,9934,9952,9945,9914,9985,9982,9970,9932,9985,9902,9975,9990,9922,9990,9994,9937,9996,9964,9943,9963,9911,9925,9935,9945,9933,9916,9930,9938,10000,9916,9911,9959,9957,9907,9913,9916,9993,9930,9975,9924,9988,9923,9910,9925,9977,9981,9927,9930,9927,9925,9923,9904,9928,9928,9986,9903,9985,9954,9938,9911,9952,9974,9926,9920,9972,9983,9973,9917,9995,9973,9977,9947,9936,9975,9954,9932,9964,9972,9935,9946,9966};
        int k=3056;
        System.out.println(maxFrequency(nums,k));

    }
}
