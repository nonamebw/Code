package leetcode.tree;


/**
 * @author non
 * @version 1.0
 * @date 2019/8/26 11:36
 */
/*Merge Two Binary Trees*/
public class MergeTrees {
    public TreeNode mergeTrees(TreeNode t1,TreeNode t2){
        if (t1 == null){
            t1 = t2;
            return t1;
        }
        if (t2 == null)
            return t1;

        t1.val += t2.val;
        TreeNode newL = mergeTrees(t1.left,t2.left);
        TreeNode newR = mergeTrees(t1.right,t2.right);
        t1.left = newL;
        t1.right = newR;
        return t1;
    }
}
