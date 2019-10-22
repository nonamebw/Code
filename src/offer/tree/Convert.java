package offer.tree;
/*二叉搜索树与双向链表
        输入一棵二叉搜索树，将该二叉搜索树转换成一个排序的双向链表。
        要求不能创建任何新的结点，只能调整树中结点指针的指向。*/
import offer.tree.TreeNode;

import java.util.Stack;
public class Convert {
    public TreeNode Convert(TreeNode pRootOfTree) {
        if(pRootOfTree==null)
            return null;
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode p = pRootOfTree;
        TreeNode pre = null;// 用于保存中序遍历序列的上一节点
        boolean isFirst = true;
        while(p!=null||!stack.isEmpty()){
            while(p!=null){   //从根节点开始，把所有的左子结点纪律下来
                stack.push(p);
                p = p.left;
            }
            p = stack.pop();
            if(isFirst){
                pRootOfTree = p;// 将BST中序遍历序列中的第一个节点记为root
                pre = pRootOfTree;
                isFirst = false;
            }else{            //BST转链表的过程
                pre.right = p;
                p.left = pre;
                pre = p;
            }
            p = p.right;   //看看p有没有右子树
        }
        return pRootOfTree;

    }
}
