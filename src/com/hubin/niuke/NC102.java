package com.hubin.niuke;

public class NC102 {
    /**
     *
     * @param root TreeNode类
     * @param o1 int整型
     * @param o2 int整型
     * @return int整型
     */
    public int lowestCommonAncestor (TreeNode root, int o1, int o2){
        // write code here

        if(root.left!=null&&findroot(root.left,o1)&&findroot(root.left,o2)){
            return lowestCommonAncestor(root.left,o1,o2);
        }
        if(root.right!=null&&findroot(root.right,o1)&&findroot(root.right,o2)){
            return lowestCommonAncestor(root.right,o1,o2);
        }else{
            return root.val;
        }

    }
    public boolean findroot(TreeNode root, int o1){

        if(root!=null&&root.val==o1){
            return true;
        }else if(root!=null&root.val!=o1) {
            if(root.left!=null&&root.right!=null){
                return findroot(root.left,o1)||findroot(root.right,o1);
            }else if(root.left!=null){
                return findroot(root.left,o1);
            }else if(root.right!=null){
                return findroot(root.right,o1);
            }else{
                return false;
            }

        }else {
            return false;
        }

    }
}
