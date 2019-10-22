package leetcode.tree;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * @author non
 * @version 1.0
 * @date 2019/9/7 12:08
 */
//按层次遍历二叉树
public class LevelOrder {
    private List<List<Integer>> levelOrder(TreeNode root){
        List<List<Integer>> lists = new LinkedList<>();
        if (root==null)
            return lists;
        List<TreeNode> cur = new LinkedList<>();  //当前这排
        cur.add(root);
        while (!cur.isEmpty()){
            List<TreeNode> next = new LinkedList<>();  //下一排
            List<Integer> temp = new LinkedList<>();
            for (TreeNode node : cur) { //遍历取值当前排的值，并且把下一排的节点存储在next链表中
                temp.add(node.val);
                if (node.left!=null)
                    next.add(node.left);
                if (node.right!=null)
                    next.add(node.right);
            }
            lists.add(temp);//把当前排的值存储
            cur = next;//把下一排的值赋给当前排
        }
        return lists;
    }
}
