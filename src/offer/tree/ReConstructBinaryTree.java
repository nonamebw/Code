package offer.tree;
/*重建二叉树
输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。
假设输入的前序遍历和中序遍历的结果中都不含重复的数字。例如输入前序遍历序列{1,2,4,7,3,5,6,8}
和中序遍历序列{4,7,2,1,5,3,8,6}，则重建二叉树并返回。*/

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
        this.left = null;
        this.right = null;
    }
}

public class ReConstructBinaryTree {
    public TreeNode reConstructBinaryTree(int[] pre, int[] in) {
        if (pre.length == 0 || in.length == 0)
            return null;
        return ConstructBinaryTree(pre, 0, pre.length - 1, in, 0, in.length - 1);
    }

    public TreeNode ConstructBinaryTree(int[] pre, int ps, int pe,
                                        int[] in, int is, int ie) {
        if (ps > pe || is > ie) {
            return null;
        }
        TreeNode root = new TreeNode(pre[ps]);
        for (int i = is; i <= ie; i++) {
            if (in[i] == pre[ps]) {
                //把根结点左子树在数组中的值给左指针，递归重建
                root.left = ConstructBinaryTree(pre, ps + 1, ps + i - is, in, is, i - 1);
                //把根结点右子数在数组中的值给右指针，递归重建
                root.right = ConstructBinaryTree(pre, ps + i - is + 1, pe, in, i + 1, ie);
                break;
            }
        }
        return root;
    }
}
