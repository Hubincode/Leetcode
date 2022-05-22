package com.hubin.leetcode;

import java.util.Arrays;

public class Solution_1 {
    public int[] twoSum(int[] nums, int target) {
        int i = 0;
        int j = 1;
        for (i = 0; i < nums.length; i++) {
            for (j = i + 1; j < nums.length; j++) {
                if ((nums[i] + nums[j]) == target) {
                    return new int[]{i, j};
                }
            }

        }
        return null;
    }

    public static void main(String[] args) {
        int[] nums={2,7,11,15};
        Solution_1 solution_1=new Solution_1();
        System.out.print(solution_1.twoSum(nums,9));
    }
}
