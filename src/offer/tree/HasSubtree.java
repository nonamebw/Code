package offer.tree;
/*树的子结构
        输入两棵二叉树A，B，判断B是不是A的子结构。（ps：我们约定空树不是任意一个树的子结构）*/

import offer.tree.TreeNode;

public class HasSubtree {
    public boolean hasSubtree(TreeNode root1, TreeNode root2) {
        if (root1 == null || root2 == null) return false;
        return IsSubtree(root1, root2)
                || hasSubtree(root1.left, root2) //裙带关系，方法入参传递父节点时，同时把父节点的孩子传参递归调用了
                || hasSubtree(root1.right, root2);
    }

    public boolean IsSubtree(TreeNode root1, TreeNode root2) {
        if (root2 == null) return true;
        if (root1 == null) return false;
        if (root1.val == root2.val)
            return IsSubtree(root1.right, root2.right)
                    && IsSubtree(root1.left, root2.left);
        else
            return false;
    }
}
