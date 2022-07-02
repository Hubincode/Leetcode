package com.hubin.leetcode;

import org.junit.Test;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution_102 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res=new LinkedList<>();
        if(root==null)
            return new LinkedList<>();
        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int size= queue.size();
            List<Integer> list=new LinkedList<>();
            while(size>0){
                TreeNode treeNode= queue.poll();
                list.add(treeNode.val);
                if(treeNode.left!=null)
                    queue.add(treeNode.left);
                if(treeNode.right!=null)
                    queue.add(treeNode.right);
                size--;
            }
            res.add(list);
        }
        return res;
    }
    @Test
    public void test(){
        TreeNode treeNode=new TreeNode(3,new TreeNode(9,null,null), new TreeNode(20,new TreeNode(15,null,null),new TreeNode(7,new TreeNode(1,null,null),null)));
        Solution_102 solution_102=new Solution_102();
        System.out.println(solution_102.levelOrder(treeNode));
    }
}
