package com.hubin.leetcode;

import org.junit.Test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
//回溯算法
public class Solution_40 {
    private List<List<Integer>> res=new LinkedList<List<Integer>>();
    private List<Integer>path=new LinkedList<>();
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
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
                dfs(candidates,target,path,pathsum+candidates[i],i+1);
                path.remove(path.size()-1);
            }
            while (((i+1)<candidates.length)&&candidates[i]==candidates[i+1]){
                i++;
            }
        }
    }
    @Test
    public void test(){
        int[] candidates={10,1,2,7,6,1,5};
        int target=8;
        Solution_40 solution_39=new Solution_40();
        System.out.println(solution_39.combinationSum2(candidates,target));
    }

}
