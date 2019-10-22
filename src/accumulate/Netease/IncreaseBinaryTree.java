package accumulate.Netease;
import java.util.*;
/*每层之和逐渐增大的二叉树
2   二组测试用例
8    BT有8个结点
2 -1 -1  该节点序号为0   value=2  left=-1 right=-1
1 5 3    该节点序号为1   value=1  left=5  right=3
4 -1 6   该节点序号为2   value=4  left=-1  right=6
2 -1 -1
3 0 2
2 4 7
7 -1 -1
2 -1 -1
8
21 6 -1
52 4 -1
80 0 3
31 7 -1
21 -1 -1
59 -1 -1
50 5 -1
48 -1 1*/
public class IncreaseBinaryTree {
    public static void main(String[] args) {
        Scanner  scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            int nodeNum = scanner.nextInt();
            HashMap<Integer,ArrayList<Integer>> map = new HashMap<>();
            Set<Integer> set = new HashSet<>();
            for (int j = 0; j<nodeNum; j++) {
                ArrayList<Integer> list = new ArrayList<>();
                for (int k = 0; k < 3; j++) {
                    int temp = scanner.nextInt();
                    list.add(temp);
                    if (k==1 || k==2){
                        set.add(temp);
                    }
                }
                map.put(nodeNum,list);
            }
            change(map,set,nodeNum);
        }
    }

    public static void change(HashMap map,Set set,int nodeNum){
        int res = 0;
        for (int i = 0; i <nodeNum; i++) {
            if(set.contains(i))
                continue;
            else
                res = i;
        }
        ArrayList<Integer> node = (ArrayList<Integer>) map.get(Integer.valueOf(res));
        Queue<Integer> queue = new ArrayDeque<>();
        queue.offer(node.get(0));
        int result = 0;
        while (!queue.isEmpty()){
            result = ((ArrayDeque<Integer>) queue).pop();
            ArrayList<Integer> left = (ArrayList<Integer>) map.get(node.get(1));
            queue.offer(left.get(0));
            ArrayList<Integer> right = (ArrayList<Integer>) map.get(node.get(2));
            queue.offer(right.get(0));
        }
    }
}
