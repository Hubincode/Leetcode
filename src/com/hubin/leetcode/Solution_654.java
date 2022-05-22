package com.hubin.leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.OptionalInt;
import java.util.Set;

public class Solution_654 {
    public static int[] findErrorNums(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int i = 0;
        int j=0;
        int max=nums.length;
        for(i=0;nums.length>i;i++){
            if (!set.contains(nums[i])) {
                set.add(nums[i]);
            }
            else {
                j=i;
            }
        }
        while(!set.isEmpty()&set.contains(max)){
            max--;
        }
        int[] res={nums[j],max};
        return res;

    }

    public static void main(String[] args) {
        int[] nums={1,2,2,4};
        nums=findErrorNums(nums);
        for(int i:nums){
            System.out.println(i);
        }



    }

}
