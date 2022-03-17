package offer.againBySort;

/**
 * @author xuchen.pbw
 * @description
 * @date 2022/3/17
 *
 * 题目：重构二叉树,数组中无重复数字
 */
public class Again4 {

    public static void main(String[] args) {
        int[] orderA = new int[]{};
        int[] orderB = new int[]{};
        rebuildTreeByBeforeMiddleSort(orderA,0,orderA.length-1,
                orderB,0,orderB.length-1);
    }

    //由前序、中序数组重构二叉树
    public static TreeNode rebuildTreeByBeforeMiddleSort(int[] preOrder,int preStart,int preEnd,
                                                  int[] inOrder,int inStart,int inEnd){
        if (preStart > preEnd || inStart > inEnd){
            return null;
        }

        TreeNode root = new TreeNode(preOrder[preStart]);
        //寻找根节点在inOrder中位置
        for (int i = inStart; i <= inEnd; i++) {
            if (inOrder[i] == preOrder[preStart]) {
                //左子树
                root.left = rebuildTreeByBeforeMiddleSort(preOrder,preStart+1,preStart + (i - inStart),
                        inOrder,inStart,i-1);
                //右子树
                root.right = rebuildTreeByBeforeMiddleSort(preOrder,preStart + i - inStart + 1,preEnd,
                        inOrder,i+1,inEnd);
                break;
            }
        }
        return root;
    }

    //TODO:中序、后序

    //TODO:中序、层序



    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) {
            val = x;
            left = null;
            right = null;
        }
    }

}
