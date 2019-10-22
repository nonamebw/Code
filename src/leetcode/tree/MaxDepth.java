package leetcode.tree;

/**
 * @author non
 * @version 1.0
 * @date 2019/8/26 11:40
 */
public class MaxDepth {
/*maxDepth of BinaryTree*/

    public int maxDepth(TreeNode root) {
        int maxDepth = 0;
        int left = 0;
        int right = 0;
        if (root == null)
            return maxDepth;
        left = maxDepth(root.left) + 1;
        right = maxDepth(root.right) + 1;
        maxDepth = left>right ? left : right;
        return maxDepth;
    }
}

/*
    public int maxDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        return 1+Math.max(maxDepth(root.left),maxDepth(root.right));
    }
}*/