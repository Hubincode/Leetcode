package com.hubin.leetcode;


import org.junit.Test;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Solution_104 {
    public int maxDepth(TreeNode root) {

        if(root==null)
            return 0;
        else
            return Math.max(maxDepth(root.left),maxDepth(root.right))+1;

    }
    public int maxDepth2(TreeNode root) {
        if (root==null) return 0;
        int res=0;
        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int size=queue.size();
            while(size!=0){
                TreeNode treeNode= queue.poll();
                if(treeNode.left!=null)
                    queue.add(treeNode.left);
                if(treeNode.right!=null)
                    queue.add(treeNode.right);
                size--;
            }
            res++;
        }
        return res;

    }

    @Test
    public void test(){
        TreeNode treeNode=new TreeNode(3,new TreeNode(9,null,null), new TreeNode(20,new TreeNode(15,null,null),new TreeNode(7,new TreeNode(1,null,null),null)));
        Solution_104 solution_104=new Solution_104();
        System.out.println(solution_104.maxDepth(treeNode));
        System.out.println(solution_104.maxDepth2(treeNode));
    }

}
