package com.hubin.niuke;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class NC15 {
    private   ArrayList<ArrayList<Integer>> res=new ArrayList<ArrayList<Integer>>();
    /**
     *
     * @param root TreeNode类
     * @return int整型ArrayList<ArrayList<>>
     */
    public ArrayList<ArrayList<Integer>> levelOrder (TreeNode root) {
        // write code here
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        if (root == null)
        {
            return res;
        }
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            ArrayList<Integer> level = new ArrayList<Integer>();
            int levelNum = queue.size();
            for (int i = 0; i < levelNum; i++) {
                if (queue.peek().left != null) {
                    queue.offer(queue.peek().left);
                }
                if (queue.peek().right != null) {
                    queue.offer(queue.peek().right);
                }
                level.add(queue.poll().val);
            }
            res.add(level);
        }
        return res;
    }


}





class TreeNode {
 int val = 0;
   TreeNode left = null;
   TreeNode right = null;
 }
