package offer.tree;

import offer.tree.TreeNode;

/*二叉树镜像
        操作给定的二叉树，将其变换为源二叉树的镜像。*/
public class Mirror {
    public class Solution {
        public void Mirror(TreeNode root) {
            if(root==null) return;
            if(root.left==null && root.right==null) return;
            TreeNode temp = root.left;  //交换根结点的左右孩子
            root.left = root.right;
            root.right = temp;
            if(root.left != null )   //递归调用左右结点、子树
                Mirror(root.left);
            if(root.right != null )
                Mirror(root.right);
        }
    }
}
