package offer.tree;

import offer.tree.TreeNode;

/*二叉树的深度
        输入一棵二叉树，求该树的深度。从根结点到叶结点依次经过的结点（含根、叶结点）形成树的一条路径，
        最长路径的长度为树的深度。*/
public class TreeDepth {
    public int TreeDepth(TreeNode root) {
        if(root==null){
            return  0;
        }
        int left = TreeDepth(root.left);  //递归就是重复的事情，我只做一遍。设想已经到了最后一步，前面自动做了n-1步
        int right = TreeDepth(root.right);
        return Math.max(left,right) + 1;
    }
}
