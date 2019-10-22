package algorithm.treeQ;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

/**
 * @author non
 * @version 1.0
 * @date 2019/9/18 8:39
 */
//二叉树的最左视野。
// 二叉树只要是按层遍历，就得知道当前层结点个数和   下一层结点个数
public class LfetSideView {
    public static ArrayList<Integer> leftSideView(TreeNode root, ArrayList<Integer> res){
        if (root==null)
            return res;
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.offer(root);
        int curNum = 1;  //当前行的个数，初始化为1
        int nextNum = 0;  //下一行的个数
        while (!queue.isEmpty()){
            TreeNode node = queue.poll();
            if (curNum==1)
                res.add(node.val);
            curNum--;

            if (node.right != null){    //显存右再存左
                queue.offer(node.right);
                nextNum++;
            }

            if (node.left != null){
                queue.offer(node.left);
                nextNum++;
            }

            if (curNum==0){
                curNum = nextNum;
                nextNum = 0;
            }
        }
        return res;
    }
}
