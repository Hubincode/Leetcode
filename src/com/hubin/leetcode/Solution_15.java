package com.hubin.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution_15 {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int pre=i-1;
            int next=i+1;
            for(int j=pre;j>-1;j--){
                if((nums[j]+nums[i])>0) continue;
                for(int k=next;k< nums.length;k++){
                    if(0==(nums[i]+nums[j]+nums[k])){
                        List list=new ArrayList<>();
                        list.add(nums[j]);
                        list.add(nums[i]);
                        list.add(nums[k]);
                        if(res.contains(list)){
                            continue;
                        }
                        res.add(list);
                    }else{
                        while(k+1<nums.length&&nums[k]==nums[k+1]){k++;}
                    }
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums={-4,-2,-2,-2,0,1,2,2,2,3,3,4,4,6,6};
        Solution_15 solution_15=new Solution_15();
        System.out.println(solution_15.threeSum(nums));
    }
}
