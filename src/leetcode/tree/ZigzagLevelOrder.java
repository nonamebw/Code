package leetcode.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author non
 * @version 1.0
 * @date 2019/9/7 13:48
 */
//按照Z字形遍历二叉树
public class ZigzagLevelOrder {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        TreeNode cur = root;
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        if (cur == null) return ans;
        Stack<TreeNode> s1 = new Stack<TreeNode>();
        Stack<TreeNode> s2 = new Stack<TreeNode>();
        s1.push(root);
        while (!s1.isEmpty() || !s2.isEmpty()) {
            List<Integer> tmp = new ArrayList<Integer>();
            while (!s1.isEmpty()) {
                cur = s1.pop();
                tmp.add(cur.val);
                if (cur.left != null) s2.push(cur.left);
                if (cur.right != null) s2.push(cur.right);
            }
            ans.add(tmp);
            tmp = new ArrayList<Integer>();
            while (!s2.isEmpty()) {
                cur = s2.pop();
                tmp.add(cur.val);
                if (cur.right != null) s1.push(cur.right);
                if (cur.left != null) s1.push(cur.left);
            }
            if (!tmp.isEmpty())
                ans.add(tmp);
        }
        return ans;
    }
}
