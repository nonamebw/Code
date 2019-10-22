package algorithm.treeQ;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * @author non
 * @version 1.0
 * @date 2019/8/21 11:07
 */
//查找二叉树每一层最大的值     思想是按照行打印二叉树
public class LargestValues {
    public void printLargestValues(TreeNode root){
        if (root == null)
            return;
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.offer(root);
        int start = 0;
        int end  = 1;
        int maxValue = Integer.MIN_VALUE;
        while (!queue.isEmpty()){
            TreeNode node = queue.poll();
            start++;
            maxValue = Math.max(maxValue,node.val);

            if (node.left != null)
                queue.add(node.left);
            if (node.right != null)
                queue.add(node.right);

            if (start==end){
                start = 0;
                end = queue.size();
                System.out.println(maxValue);
                maxValue = Integer.MIN_VALUE;
            }
        }
    }
}
