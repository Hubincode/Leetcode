package com.hubin.leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution_113 {
    List<List<Integer>> res=new LinkedList<>();
    List<Integer> list=new ArrayList<>();
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        DFS(root,targetSum,0);
        return res;
    }
    public void DFS(TreeNode root, int targetSum,int sum) {
        if(root==null)
            return;
        list.add(root.val);
        sum+=root.val;
        if(root.right==null&&root.left==null&&targetSum==sum){
            res.add(new ArrayList<>(list));
        }
        DFS(root.left,targetSum,sum);
        DFS(root.right,targetSum,sum);
        list.remove(list.size()-1);
    }
}
