package com.hubin.niuke;

import java.util.ArrayList;
import java.util.Arrays;

public class NC45 {
    /**
     *
     * @param root TreeNode类 the root of binary tree
     * @return int整型二维数组
     */
    public int[][] threeOrders (TreeNode root) {
        // write code here
        ArrayList<ArrayList<Integer>> arrayLists=new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> arrayList=new ArrayList<>();
        int[][] res = new int[3][];
        //先序遍历
        arrayList.clear();
        PreOrder(root,arrayList);
        res[0]=arrayList.stream().mapToInt(Integer::intValue).toArray();

        //中序遍历
        arrayList.clear();
        InOrder(root,arrayList);
        res[1]=arrayList.stream().mapToInt(Integer::intValue).toArray();

        //后序遍历
        arrayList.clear();
        PostOrder(root,arrayList);
        res[2]=arrayList.stream().mapToInt(Integer::intValue).toArray();

        return res;
    }
    public void PreOrder(TreeNode root, ArrayList<Integer> res){
        if(root==null){
            return;
        }
        res.add(root.val);
        PreOrder(root.left,res);
        PreOrder(root.right,res);
    }

    public void InOrder(TreeNode root, ArrayList<Integer> res){
        if(root==null){
            return;
        }

        InOrder(root.left,res);
        res.add(root.val);
        InOrder(root.right,res);
    }
    public void PostOrder(TreeNode root, ArrayList<Integer> res){
        if(root==null){
            return;
        }

        PostOrder(root.left,res);
        PostOrder(root.right,res);
        res.add(root.val);
    }
}
