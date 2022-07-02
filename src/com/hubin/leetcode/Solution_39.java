package com.hubin.leetcode;

import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

public class Solution_39 {
    private List<List<Integer>> res=new LinkedList<List<Integer>>();
    private List<Integer>path=new LinkedList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        dfs(candidates,target,path,0,0);
        return res;

    }
    public void dfs(int[] candidates, int target,List<Integer>path, int pathsum,int startindex){
        if(pathsum==target){
            res.add(new LinkedList<Integer>(path));
            return;
        }
        for(int i=startindex;i<candidates.length;i++){
            if(pathsum+candidates[i]<=target){
                path.add(candidates[i]);
                dfs(candidates,target,path,pathsum+candidates[i],i);
                path.remove(path.size()-1);
            }
        }
    }
    @Test
    public void test(){
        int[] candidates={2,3,6,7};
        int target=7;
        Solution_39 solution_39=new Solution_39();
        System.out.println(solution_39.combinationSum(candidates,target));
    }
}
