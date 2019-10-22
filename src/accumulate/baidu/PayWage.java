package accumulate.baidu;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
//有n中面值的钞票，每种面额xi的数量为yi，且yi间能整除。若每月要发m的工资，不能用钞票找零，问这些钞票最多能发几个月工资

class Node{
    int x;
    int y;
    public Node(int x,int y){
        this.x = x;
        this.y = y;
    }
}
public class PayWage {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        List<Node> list = new ArrayList<>();
        for(int i = 0;i<n;i++){
            Node node = new Node(sc.nextInt(),sc.nextInt());
            list.add(node);
        }
        list.sort(new Comparator<Node>() {
            public int compare(Node o1, Node o2) {
                return o1.x -o2.x;
            }
        });
        int k ,ans = 0;
        for(k = n-1;k>=0;k--){
            if(list.get(k).x>=m){
                ans += list.get(k).y;
            }else
                break;
        }
        boolean flag = true;
        while(flag){
            flag = false;
            int t = m;
            //优先大面额
            for(int i = k;i>=0;i--){
                while(t >list.get(i).x && list.get(i).y >0){
                    t -= list.get(i).x;
                    list.get(i).y--;
                }
            }
            //再用小面额填补
            for(int i = 0;i<=k;i++){
                while(t>0 && list.get(i).y>0){
                    t -= list.get(i).x;
                    list.get(i).y --;
                }
            }
            if(t <= 0){
                flag = true;
                ans ++;
            }
        }
        System.out.println(ans);
    }
}
