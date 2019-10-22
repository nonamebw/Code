package accumulate.bytedance;

import java.util.*;

/*字符串S由小写字母构成，长度为n。定义一种操作，每次都可以挑选字符串中任意的两个相邻字母进行交换。
        询问在至多交换m次之后，字符串中最多有多少个连续的位置上的字母相同？
        示例1
        输入
        abcbaa 2
        输出
        2*/
public class AlphabetChang {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String s=scan.next();
        int m=scan.nextInt();
        char[] chars=s.toCharArray();
        Map<Character,ArrayList<Integer>> map=new HashMap<Character,ArrayList<Integer>>();
        for(int i=0;i<chars.length;i++){
            char key=chars[i];
            if(map.containsKey(key)){
                ArrayList<Integer> list=map.get(key);
                list.add(i);
            }else{
                ArrayList<Integer> list=new ArrayList<Integer>();
                list.add(i);
                map.put(key,list);
            }
        }
        int count=0;
        /*int max = Integer.MIN_VALUE;*/
        for(int i=0;i<26;i++) {
            char key=(char) ('a'+i);
            ArrayList<Integer> list=map.get(key);
            if(list!=null)
            {
                //j代表新坐标系下标，list.get(j)为第下标为j的字母在原始数组中的下标
                //dp为 新坐标系中两个字母对应的原始坐标区间合成连续字母串所需步数
                //第一个下标已确定，连续长度len已确定，则第二个下标不可能超过list.size()
                //j+1到j所需操作步数（即空格数）为list.get(j+1)-list.get(j)-1
                //j+len-2所在字母经操作后已移到原始坐标list.get(j+1)+(len-2-1)处
                //j+len-1到j+len-2所需操作步数（即空格数）为list.get(j+len-1)-[list.get(j+1)+(len-2-1)]-1
                // list.get(j+1)-list.get(j)-1   +    list.get(j+len-1)-[list.get(j+1)+(len-2-1)]-1
                //=list.get(j+len-1) - list.get(j) + 1 -len
                //或者直接计算空格数，有多少空格，两端字母就移动几次：j+len-1,j区间共有len个字母(包括两端)
                //则空格数为： list.get(j+len-1) - list.get(j) + 1 -len;
                int[][] dp = new int[list.size()][list.size()];
                for(int len=2;len<=list.size();len++) {
                    for (int j = 0; j + len - 1 < list.size(); j ++) {
                        dp[j][j+len-1] = dp[j+1][j+len-2] + list.get(j+len-1) - list.get(j) + 1 -len;
                        if (dp[j][j+len-1] <= m && count < len)
                            count = len;
                    }
                }

/*                for (int j = 0; j < list.size()-1; j++) {
                    if (list.get(j)-list.get(j+1)<=m){
                        count++;
                        max = Math.max(max,count);
                    }else {
                        count = 1;
                    }
                }*/
            }
            /* count = 1;*/
        }
        System.out.println(count);
    }

    public static void solution( ) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int m = sc.nextInt();
        Map<Character, List> map = new HashMap<Character, List>(26); // key为字符串中的每个字母，value记录该字母在字符串中出现的位置
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            List list = map.get(c);
            if (list == null)
                map.put(c, list = new ArrayList<Integer>(100));
            list.add(i);
        }
        int maxLen = 1; // 记录连续最长的相同字母数量
        // 遍历map
        for (Map.Entry<Character, List> entry : map.entrySet()) {
            List<Integer> arrayList = entry.getValue();
            // 遍历字母在字符串中出现的位置
            for (int i = 0; i < arrayList.size(); i++) {
                int ctr = arrayList.get(i); // 以当前遍历的元素位置为中心，计算其他相同元素到到该中心需移动的步数
                int[] move = new int[arrayList.size()];
                // 获取 move[]，表示每个相同字母到中心点 ctr 需要移动的最少步数
                for (int j = 0; j < arrayList.size(); j++)
                    move[j] = (Math.abs(arrayList.get(j) - ctr) -
                            Math.abs(i - j));
                // 排序后，选择移动代价最少的前 k + 1 个
                Arrays.sort(move);
                int sum = 0; // 记录移动步数之和
                for (int k = 0; k < move.length; k++) {
                    sum += move[k];
                    if (sum > m)
                        break;
                    // 每有一个字母移动到中心点，该字母的连续相同数量就增加1
                    if (k + 1 > maxLen)
                        maxLen = k + 1;
                }
            }
        }
        System.out.println(maxLen);
    }
}
