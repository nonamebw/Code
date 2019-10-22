package leetcode.tree;

import java.util.HashMap;
import java.util.Map;

/**
 * @author non
 * @version 1.0
 * @date 2019/9/8 10:40
 */
/*根据先序和中序数组，重建构建二叉树，先序和中序数组中没有重复的数字
        preorder = [3,9,20,15,7]  先序根节点后left个数在左子树上，最后的right个数在右子树上
        inorder = [9,3,15,20,7]   中序根节点左边的值在左子树上 left，根节点右边的值在右子树上 right
        */
public class PreorderInorderBuildTree {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        Map<Integer, Integer> inMap = new HashMap<Integer, Integer>();

        for(int i = 0; i < inorder.length; i++) {
            inMap.put(inorder[i], i);   //inMap中存着中序数组
        }
        TreeNode root = buildTree(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1, inMap);
        return root;
    }

    public TreeNode buildTree(int[] preorder, int preStart, int preEnd, int[] inorder, int inStart, int inEnd, Map<Integer, Integer> inMap) {
        if(preStart > preEnd || inStart > inEnd) return null;

        TreeNode root = new TreeNode(preorder[preStart]);  //建立根结点并赋初始值
        int inRoot = inMap.get(root.val);    //根节点的值中序中的位置编号
        int numsLeft = inRoot - inStart;

        //构建根节点的左子树
        root.left = buildTree(preorder, preStart + 1, preStart + numsLeft, inorder, inStart, inRoot - 1, inMap);
        //构建根结点的右子树
        root.right = buildTree(preorder, preStart + numsLeft + 1, preEnd, inorder, inRoot + 1, inEnd, inMap);

        return root;
    }
}
