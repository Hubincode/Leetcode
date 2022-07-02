package com.hubin.leetcode;

import org.junit.Test;

public class Solution_112 {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null)
            return false;
        if(root.right==null&&root.left==null&&root.val==targetSum){
            return true;
        }else {
            return hasPathSum(root.left,targetSum-root.val)||hasPathSum(root.right,targetSum-root.val);
        }
    }
    @Test
    public void test(){
        TreeNode treeNode=new TreeNode(1,new TreeNode(2,null,null), new TreeNode(3,null,null));
        Solution_112 solution_112=new Solution_112();
        System.out.println(solution_112.hasPathSum(treeNode,5));

    }
}
