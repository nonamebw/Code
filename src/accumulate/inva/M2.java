package accumulate.inva;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) {
        val = x;
        left = null;
        right = null;
    }
}


/**
 * @author non
 * @version 1.0
 * @date 2019/9/16 20:00
 */
public class M2 {
    int maxLength = 0;
    public int findPath(TreeNode root){
        if (root==null)
            return 0;
        getThePath(root);
        return maxLength;

    }
    public int getThePath(TreeNode root){
        if (root==null) {
            return 0;
        }
        int right = getThePath(root.right);
        if (right!=0 && root.val != root.right.val)
            right = 0;
        int left = getThePath(root.left);
        if (left!=0 && root.val != root.left.val) {
            left = 0;
        }
        int Length = left+right+1;
        maxLength = maxLength>Length?maxLength:Length;
        return (Math.max(left,right)+1);
    }
}
