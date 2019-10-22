package leetcode.tree;

/**
 * @author non
 * @version 1.0
 * @date 2019/9/5 19:05
 */
/*排序数组转换为BST
        Given the sorted array: [-10,-3,0,5,9],
        One possible answer is: [0,-3,9,-10,null,5]按层次输出*/

public class SortedArrayToBST {
    public static void main(String[] args) {

    }
    public static TreeNode sortedArrayToBST(int[] num){
       return buildTreeNode(num,0,num.length);
    }
    public static TreeNode buildTreeNode(int[] num, int low, int high){
        if (low>high)
            return null;
        int mid = low + high;
        TreeNode node = new TreeNode(num[mid]);
        node.left = buildTreeNode(num, low, mid-1);
        node.right = buildTreeNode(num,mid+1,high);
        return node;
    }
}
