package com.hubin.leetcode;

import java.util.LinkedList;
import java.util.List;

public class Solution_144 {
    List<Integer> res=new LinkedList<>();
    public List<Integer> preorderTraversal(TreeNode root) {
        preorderTraversal2(root);
        return res;
    }
    public void preorderTraversal2(TreeNode root) {
        if(root==null) return;
        res.add(root.val);
        preorderTraversal2(root.left);
        preorderTraversal2(root.right);
    }


}
