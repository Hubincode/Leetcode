package com.hubin.leetcode;

import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;

public class Solution_435 {
    public int eraseOverlapIntervals(int[][] intervals) {
        if (intervals.length == 0) return 0;
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1] - o2[1];
            }
        });
        int n = intervals.length;
        int right = intervals[0][1];
        int ans = 0;
        for (int i = 1; i < n; i++) {
            if (intervals[i][0] >= right) {
                ans++;
                right = intervals[i][1];
            }
        }
        return n-ans;
    }
    @Test
    public void test(){
        int[][] intervals={{1,2},{2,3},{3,4},{1,3}};
        Solution_435 solution_435=new Solution_435();
        System.out.println(solution_435.eraseOverlapIntervals(intervals));
    }
}
