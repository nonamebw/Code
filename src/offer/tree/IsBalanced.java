package offer.tree;

import offer.tree.TreeNode;

/*平衡二叉树
        输入一棵二叉树，判断该二叉树是否是平衡二叉树。*/
public class IsBalanced {
    //后续遍历时，遍历到一个节点，其左右子树已经遍历  依次自底向上判断，每个节点只需要遍历一次
    private boolean isBalanced=true;
    public boolean IsBalanced(TreeNode root) {
        getDepth(root);
        return isBalanced;
    }
    public int getDepth(TreeNode root){
        if(root==null)
            return 0;
        int left=getDepth(root.left);
        int right=getDepth(root.right);

        //平衡二叉树的路径差最大为1
        if(Math.abs(left-right)>1){
            isBalanced=false;
        }
        return right>left ?right+1:left+1;
    }
}
