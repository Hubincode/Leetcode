package com.hubin.leetcode;


import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

class TreeNode {
     int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }


public class Solution_94 {
    ArrayList res=new ArrayList();
    public List<Integer> inorderTraversal(TreeNode root) {

        this.inorderTraversal2(root);
        return res;
    }
    public void inorderTraversal2(TreeNode root){
        if(root==null) return;
        inorderTraversal(root.left);
        res.add(root.val);
        inorderTraversal(root.right);

    }
    @Test
    public void test(){
        TreeNode treeNode=new TreeNode(1,null, new TreeNode(4,new TreeNode(3,null,null),null));
        Solution_94 solution_94=new Solution_94();
        System.out.println(solution_94.inorderTraversal(treeNode));
    }
}
