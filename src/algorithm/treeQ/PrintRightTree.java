package algorithm.treeQ;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * @author non
 * @version 1.0
 * @date 2019/8/21 9:23
 */

/*打印二叉树最右的结点
对于Queue来说，就是一个FIFO（先进先出）的队列，添加元素只能在队尾，移除只能在队首
        add(E e)：添加一个元素到队尾
        remove()：获取队首的元素，并从队列中移除
        element()：获取队首的元素，但不从队列中移除
        这一组，成功返回true，失败时返回一个特殊值(取决于操作，为NULL或false)，offer(E e)操作是专为容量受限的队列实现而设计的；在大多数实现中，插入操作不会失败。
        offer(E e)：添加一个元素到队尾
        poll()：获取队首的元素，并从队列中移除
        peek()：获取队首的元素，但不从队列中移除*/

public class PrintRightTree {
    public static void main(String[] args) {

    }
    public void printRightNode(TreeNode root){
        if (root == null)
            return;
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);
        int start = 0;   //给每一层的开始和结尾做好标志
        int end  = 1;
        while (!queue.isEmpty()){
            TreeNode node = queue.poll();
            start++;

            if (node.left != null)
                queue.add(node.left);
            if (node.right != null)
                queue.add(node.right);

            if (start==end){
                start = 0;
                end = queue.size();
                System.out.println(node.val);
            }
        }
    }
}

class TreeNode{
    public TreeNode left;
    public TreeNode right;
    public int val;
    public TreeNode(int val){
        this.val = val;
    }
}
