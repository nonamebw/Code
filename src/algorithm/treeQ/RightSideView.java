package algorithm.treeQ;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author non
 * @version 1.0
 * @date 2019/8/21 10:56
 */
public class RightSideView {
    public List<Integer> rightSideView(TreeNode root){
        List<Integer> res = new ArrayList<>();
        if (root==null)
            return res;
        bfs(root,res);
        return res;
    }

    private void bfs(TreeNode root,List<Integer> ret){
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int curNum = 1;
        int nextNum = 0;
        while (!q.isEmpty()){
            TreeNode node = q.poll();
            if (curNum==1)         //每次减到1时就说明到了最右结点了。
                ret.add(node.val);
            curNum--;

            if (node.left != null){   //这里改一下，从右往左装，就是打印最左结点了
                q.offer(node.left);
                nextNum++;
            }
            if (node.right != null){
                q.offer(node.right);
                nextNum++;
            }

            if (curNum==0){
                curNum = nextNum;
                nextNum = 0;
            }
        }
    }
}
