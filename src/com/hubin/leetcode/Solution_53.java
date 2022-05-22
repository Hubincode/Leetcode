package com.hubin.leetcode;

import org.junit.Test;

import java.util.Arrays;

public class Solution_53 {
    public int search(int[] nums, int target) {
        Arrays.sort(nums);
        int i = 0;
        for (int j : nums) {
            if (j == target) {
                i++;
            } else if (j > target) {
                break;
            }
        }
        return i;
    }
    @Test
    public void test(){
        int[] nums={1,2,2,3,4,5,5,5};
        int target=2;
        System.out.println(search(nums,target));

    }
}
