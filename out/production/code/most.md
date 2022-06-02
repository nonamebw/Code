## 数据结构类

### 链表

#### 1、从尾到头打印链表

思路： 把遍历的结果放入栈中（先进后出），这样输出栈就实现了从尾到头输出链表元素。 

```java
public static void printListReversinglyByStack(ListNode listNode){
	if(listNode == null){ //如果为空，直接返回
		return;
	}
	Stack<Integer> stack = new Stack<Integer>(); //借助于栈
	while(listNode!=null){
		stack.push(listNode.data); //将数据放入栈中
		listNode = listNode.next; //指针域指向下一个指针
	}
	while(!stack.isEmpty()){ 
		System.out.print(stack.pop() + " "); //借助于栈输出
	}
}
```

#### 2、链表倒数第k个结点

思路：第1个指针先走k-1，随后第2个指针和第1个一起走，1到尾2即k。

```java
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode getKthFromEnd(ListNode head, int k) {
        if(head==null)   return null;
        ListNode slow=head;
        ListNode fast=head;
        for(int i=0;i<k;i++){
            fast=fast.next;
        }
        while(fast!=null){
            slow=slow.next;
            fast=fast.next;
        }
        return slow;
    }
}

```

#### 3、反转链表

```java
public ListNode reverseList(ListNode head){
    if(head == null){
        return null;
    }
    
    ListNode post = head.next; //当前结点的后一个结点
    ListNode temp = post; //临时结点
    ListNode cur = head; //当前结点
    cur.next = null;
    while(post != null){
        temp = post.next;
        post.next = cur; //反转指向
        cur = post; //指针移动
        post = temp;
    }
    return cur;
}
```

#### 4、合并两个有序链表

```java
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null) {
            return l2;
        }
        if(l2 == null) {
            return l1;
        }

        if(l1.val < l2.val) {
            l1.next = mergeTwoLists(l1.next, l2);		//递归l1下一个结点再比较
            return l1;
        } else {
            l2.next = mergeTwoLists(l1, l2.next);		//递归l2下一个结点再比较
            return l2;
        }
    }
}

```

### 二叉树

#### 1、重建二叉树

题目：前序 + 中序，重建二叉树

```java
public TreeNode rebuildBinaryTree(int preorder[], int inorder[]) {
	if (preorder == null || inorder == null) { //如果前序或者中序有一个是空直接返回
		return null;
	}
    // 定义构建二叉树的核心算法
	TreeNode root = rebuildBinaryTreeCore(preorder, 0, preorder.length - 1,
			inorder, 0, inorder.length - 1);
	return root;
}
	// 构建二叉树的核心算法
public TreeNode rebuildBinaryTreeCore(int preorder[], int startPreorder,
		int endPreorder, int inorder[], int startInorder, int endInorder) {
	if (startPreorder > endPreorder || startInorder > endInorder) { //停止递归的条件
		return null;
	}
	TreeNode root = new TreeNode(preorder[startPreorder]);
	for (int i = startInorder; i <= endInorder; i++) {
		if (preorder[startPreorder] == inorder[i]) {
			// 其中（i - startInorder）为中序排序中左子树结点的个数
			//左子树
			root.left = rebuildBinaryTreeCore(preorder, startPreorder + 1,
					startPreorder + (i - startInorder), inorder,
					startInorder, i - 1);
			//右子树
			root.right = rebuildBinaryTreeCore(preorder, (i - startInorder)
					+ startPreorder + 1, endPreorder, inorder, i + 1,
					endInorder);
 
		}
	}
	return root;
}
```

题目：中序 +  后续，重建二叉树

```java
public static TreeNode rebuildBinaryTree(int[] postorder, int[] inorder) {
	if (postorder == null || inorder == null) {
		return null;
	}
	TreeNode root = rebuildBinaryTreeCore(postorder, 0,
			postorder.length - 1, inorder, 0, inorder.length - 1);
	return root;
}
 
public static TreeNode rebuildBinaryTreeCore(int[] postorder,
		int startPostorder, int endPostorder, int[] inorder,
		int startInorder, int endInorder) {
 
	if (startPostorder > endPostorder || startInorder > endInorder) { // 终止递归的条件
		return null;
	}
	TreeNode root = new TreeNode(postorder[endPostorder]);
	for (int i = startInorder; i <= endInorder; i++) {
		if (inorder[i] == postorder[endPostorder]) {
			root.left = rebuildBinaryTreeCore(postorder, startPostorder,
					startPostorder - 1 + (i - startInorder), inorder,
					startInorder, i - 1);
			root.right = rebuildBinaryTreeCore(postorder, startPostorder
					+ (i - startInorder), endPostorder - 1, inorder, i + 1,
					endInorder);
		}
	}
	return root;
}
```

#### 2、树的子结构

题目：两颗树A、B，判断B是否为A的子结构

```java
public static boolean hasSubTree(TreeNode root1, TreeNode root2){
    if(root1 == null || root2 == null){
        return false;
    }
    
    boolean isSubTree = false;
    if(root1.val == root2.val) {
        isSubTree = isSubTree(root1,root2);
    }
    
    if(!isSubTree) {
        isSubTree = isSubTree(root1.left,root2);
    }
    
    if(!isSubTree) {
        isSubTree = isSubTree(root1.right,root2);
    }
    return isSubTree;
}

public static boolean isSubTree(TreeNode root1,TreeNode root2) {
    if(root2 == null) {
        return true;
    }
    
    if(root1 == null) {
        return false;
    }
    
    if(roo1.val == root2.vall) {
        return isSubTree(root1.left,root2.left) &&
            isSubTree(root1.right,roo2.right);
    }
    return false;
}
```

#### 3、镜像二叉树

题目：求二叉树的镜像

```java
public void Mirror(TreeNode root){
    if(root == null){
        return;
    }
    
    if(root.left == null && root.right == null) {
        return;
    } 
    
    swapLR(root);
    Mirror(root.left);
  	Mirrot(root.right);
}

public void swapLR(TreeNode node){
    TreeNode temp = node.left;
    node.left = node.right;
    node.right = temp;
}
```

### 队列、栈

#### 1、两个栈实现队列

思路：stack1弹栈为空时，就去stack2里取数据

```java
public class solution{
    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();
    
    //压栈
    public void push(int x){
        stack2.push(x);
    }
    
    //弹栈
    public Integer pop() {
        if(stack1.isEmpty()) {
            while(!stack2.isEmpty()) {
                stack1.push(stack2.pop());
            }
        }
        return stack1.pop();
    }
}
```

#### 2、包含min函数的栈

```java
public class Solution{
    Stack<Integer> stack = new Stack<>();
    public void push(int x){
        stack.push(x);
    }
    
    public int top(){
       return stack.peek();
    }
    
    public int min() {
        Iterator iterator = stack.iterator;        
        int min = stack.peek();
        int temp = 0;
        while(iterator.hasNext()){
            temp = iterator.next;
            if(temp < min){
                min = temp
            }
        }
        return min;
    }
}


import java.util.Iterator;
import java.util.Stack;
/**
 * @author xuchen.pbw
 * @description
 * @date 2022/5/11
 */
public class Solution {

    Stack<Integer> stack1 = new Stack<>();
    
    public void push(int node) {
        stack1.push(node);
    }

    public void pop() {
        stack1.pop();
    }

    public int top() {
       return stack1.peek();
    }

    public int min() {
        Iterator iterator = stack1.iterator();
        int min = Integer.MAX_VALUE;
        while (iterator.hasNext()) {
            min = Math.min(min,(int)iterator.next());
        }
        return min;
    }
}

```

#### 3、栈的压入、弹出序列

题目：给出栈压入序列，判断某序列是否为其出栈序列

```java
public boolean isPopOrder(int[] pushOrder,int[] popOrder){
    if(pushOrder.length == 0 || popOrder.length == 0) {
        return false;
    }
    int popIndex = 0; //弹出栈角标指针
    Stack<Integer> temp = new Stack<>();
    for(int i=0; i < pushOrder.length; i++) {
        temp.push(pushOrder[i]);
        while(!temp.isEmpty() && popOrder[popIndex] == temp.peek().intVlue()) {
            temp.pop();
            popIndex++;
        }
    }
    return temp.isEmpty();
}
```

#### 4、有效的括号

思路：遇到前括号就入栈，遇到后括号就出栈

```java
class Solution {
public:
    bool isValid(string s) {
        stack<char>st;
        for(int i=0;i<s.size();i++)
        {
            if(s[i]=='('||s[i]=='['||s[i]=='{')
                st.push(s[i]);
            else
            {
                if(st.empty())
                    return false;
                else
                {
                    if(s[i]==')'&&st.top()=='(')
                        st.pop();
                    else if(s[i]==']'&&st.top()=='[')
                        st.pop();
                    else if(s[i]=='}'&&st.top()=='{')
                        st.pop();
                }
            }
        }
        if(st.empty())
            return true;
        else 
            return false;
    }
};
```

思路：字符串消退

```java

```



### 字符串

#### 1、最长回文串

思路：把回文看成中间的部分全是同一字符，左右部分相对称。去除中间后再对比。

```java
class Solution {
    public String longestPalindrome(String s) {
        if (s == null || s.length() == 0) {
            return "";
        }
//         保存起始位置，测试了用数组似乎能比全局变量稍快一点
        int[] range = new int[2];
        char[] str = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
//             把回文看成中间的部分全是同一字符，左右部分相对称
//             找到下一个与当前字符不同的字符
            i = findLongest(str, i, range);
        }
        return s.substring(range[0], range[1] + 1);
    }
    
    public static int findLongest(char[] str, int low, int[] range) {
//         查找中间部分
        int high = low;
        while (high < str.length - 1 && str[high + 1] == str[low]) {
            high++;
        }
//         定位中间部分的最后一个字符
        int ans = high;
//         从中间向左右扩散
        while (low > 0 && high < str.length - 1 && str[low - 1] == str[high + 1]) {
            low--;
            high++;
        }
//         记录最大长度
        if (high - low > range[1] - range[0]) {
            range[0] = low;
            range[1] = high;
        }
        return ans;
    }
}
```

#### 2、最长无重复字串

思路：记录每个字符出现的位置，滑动窗口。

```java
class Solution {
    public int lengthOfLongestSubstring(String s) {
        // 记录字符上一次出现的位置
        int[] last = new int[128];
        for(int i = 0; i < 128; i++) {
            last[i] = -1;
        }
        int n = s.length();

        int res = 0;
        int start = 0; // 窗口开始位置
        for(int i = 0; i < n; i++) {
            int index = s.charAt(i);
            start = Math.max(start, last[index] + 1);
            res   = Math.max(res, i - start + 1);
            last[index] = i;
        }

        return res;
    }
}
```

#### 3、最长公共前缀

思路：公共前缀比所有字符串都短，随便选一个先。然后while一直减，判断startsWith

```java
class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==0)return "";
        //公共前缀比所有字符串都短，随便选一个先
        String s=strs[0];
        for (String string : strs) {
            while(!string.startsWith(s)){  //while 一直让s减短，减到“” 肯定不会有公共前缀
                if(s.length()==0)return "";
                //公共前缀不匹配就让它变短！
                s=s.substring(0,s.length()-1);
            }
        }
        return s;
    }
}
```

#### 4、字符串乘积

思路：num1的第i位(高位从0开始)和num2的第j位相乘的结果在乘积中的位置是[i+j, i+j+1]。

```java
class Solution {
    public String multiply(String num1, String num2) {
        /**
        num1的第i位(高位从0开始)和num2的第j位相乘的结果在乘积中的位置是[i+j, i+j+1]
        例: 123 * 45,  123的第1位 2 和45的第0位 4 乘积 08 存放在结果的第[1, 2]位中
          index:    0 1 2 3 4  
              
                        1 2 3
                    *     4 5
                    ---------
                          1 5
                        1 0
                      0 5
                    ---------
                      0 6 1 5
                        1 2
                      0 8
                    0 4
                    ---------
                    0 5 5 3 5
        这样我们就可以单独都对每一位进行相乘计算把结果存入相应的index中        
        **/
        
        int n1 = num1.length()-1;
        int n2 = num2.length()-1;
        if(n1 < 0 || n2 < 0) return "";
        int[] mul = new int[n1+n2+2];
        
        for(int i = n1; i >= 0; --i) {
            for(int j = n2; j >= 0; --j) {
                int bitmul = (num1.charAt(i)-'0') * (num2.charAt(j)-'0');      
                bitmul += mul[i+j+1]; // 先加低位判断是否有新的进位
                
                mul[i+j] += bitmul / 10;
                mul[i+j+1] = bitmul % 10;
            }
        }
        
        StringBuilder sb = new StringBuilder();
        int i = 0;
        // 去掉前导0
        while(i < mul.length-1 && mul[i] == 0) 
            i++;
        for(; i < mul.length; ++i)
            sb.append(mul[i]);
        return sb.toString();
    }
}
```



### 数组

#### 1、二维数组查找

题目：二维数组，从左至右递增，从上到下递增，判断某个整数是否在该二维数组中。

思路：从左下角开始找

```java
public static boolean find2DMatrix(int[][] arr, int target){
    int row = arr.length - 1; //行
    int col = 0; //列
    if(row ==0 ){
        return false;
    }
    while(row >= 0 && clo < arr[0].length()) {
        if(arr[row][col] == target) {
            return true;
        }else if(arr[row][col] > target) {
            row--;
        }else if(arr[row][col] < target) {
            col++;
        }
    }
    return false;
}
```

#### 2、数组奇偶顺序

题目：调整数组顺序，奇前偶后，相对位置不变。

思路：从尾到头，前偶后奇就交换；从头到位，找到第一个偶，再找到第一个奇，换。

```java
public class Solution {
    public void reOrderArray(int [] array) {
        for (int i = 0; i < array.length;i++)
        {
            for (int j = array.length - 1; j>i;j--)
            {
                if (array[j - 1]%2 == 0 && array[j] % 2 == 1) //前偶后奇就交换
                {
                    int tmp = array[j];//交换
                    array[j] = array[j-1];
                    array[j-1] = tmp;
                }
            }
        }
    }
}


```



## 算法类

### 递归

#### 1、跳台阶

题目：n个台阶，一次只能跳1阶或者2阶，有多少种跳法。

```java
public int jumpFloor(int target) {
    if(target == 1 || target == 2){
        return target;
    }
    return jumpFloor(target -1) + jumpFloor(target-2);
}
```

题目：n个台阶，变态跳，有多少种跳法。

```java
public int jumpFloor(int target) {
    if(target == 1 ){
        return 1;
    }
    return 2 * jumpFloor(target -1);
}
```

### 常见问题

#### 1、背包问题

```text
dp[i][j]表示将前i件物品装进限重为j的背包可以获得的最大价值, 0<=i<=N, 0<=j<=W
```

##### 0-1背包

 01背包问题（01 knapsack problem）：一共有N件物品，第i（i从1开始）件物品的重量为w[i]，价值为v[i]。在总重量不超过背包承载上限W的情况下，能够装入背包的最大价值是多少？ 

1. 不装入第i件物品，即`dp[i−1][j]`；
2. 装入第i件物品（前提是能装下），即`dp[i−1][j−w[i]] + v[i]`。

即状态转移方程为

```text
dp[i][j] = max(dp[i−1][j], dp[i−1][j−w[i]]+v[i]) // j >= w[i]
```

##### 多重背包

 多重背包（bounded knapsack problem）与前面不同就是每种物品是有限个：一共有N种物品，第i（i从1开始）种物品的数量为n[i]，重量为w[i]，价值为v[i]。在总重量不超过背包承载上限W的情况下，能够装入背包的最大价值是多少？ 

```text
# k为装入第i种物品的件数, k <= min(n[i], j/w[i])
dp[i][j] = max{(dp[i-1][j − k*w[i]] + k*v[i]) for every k}
```

##### 完全背包

 完全背包（unbounded knapsack problem）与01背包不同就是每种物品可以有无限多个 。

1. 不装入第i种物品，即`dp[i−1][j]`，同01背包；
2. 装入第i种物品，此时和01背包不太一样，因为每种物品有无限个（但注意书包限重是有限的），所以此时不应该转移到`dp[i−1][j−w[i]]`而应该转移到`dp[i][j−w[i]]`，即装入第i种商品后还可以再继续装入第种商品。

所以状态转移方程为

```text
dp[i][j] = max(dp[i−1][j], dp[i][j−w[i]]+v[i]) // j >= w[i]
```

### 其它

#### 1、斐波那契数列

思路：fn = f(n-1) + f(n-2)

```java
public static int FibonacciSequence(int n) {
    if (n < 2) return n;
    int f0 = 0;
    int f1 = 1;
    int fn;
    for(int i = 2; i <= n; i++) {
        fn = f0 + f1;
        f0 = f1;
        f1 = fn;
    }
    return fi;
}
```

#### 2、二进制中1的个数

思路：1100 & 1011= 1000，有多少个这样的操作，就有多少个1。

```java
public static int countOf1(int n) {
    int count = 0;
    while(n != 0) {
        n = n & (n-1);
        count++;
    }
    return count;
}
```

#### 3、数值的整数次方

a^n = a^(n/2) * a^(n/2)；n为偶数；

a^n = a^[(n-1)/2] * a^[(n-1)/2] * a；n为奇数；

这是一个典型的递归问题。

```java
public double powerWithExponent1(double base, int exponent){
	if(exponent == 0){
		return 1;
	}
	if(exponent == 1){
		return base;
	}
	double result = powerWithExponent1(base, exponent >> 1); //用右移运算代替了除以2
	result*=result;
	if((exponent & 0x1) == 1){ //用位与运算符代替了求余运算符（%）来判断一个数是奇数还是偶数，如果是奇数还需要再乘一个base
		result*=base;
	}
	return result;
}
```

## 

## 实战

#### 华为

##### 1、带条件的背包问题

题目：

王强决定把年终奖用于购物，他把想买的物品分为两类：主件与附件，附件是从属于某个主件的，下表就是一些主件与附件的例子：

| 主件   | 附件           |
| ------ | -------------- |
| 电脑   | 打印机，扫描仪 |
| 书柜   | 图书           |
| 书桌   | 台灯，文具     |
| 工作椅 | 无             |

如果要买归类为附件的物品，必须先买该附件所属的主件，且每件物品只能购买一次。

每个主件可以有 0 个、 1 个或 2 个附件。附件不再有从属于自己的附件。

王强查到了每件物品的价格（都是 10 元的整数倍），而他只有 N 元的预算。除此之外，他给每件物品规定了一个重要度，用整数 1 **~** 5 表示。他希望在花费不超过 N 元的前提下，使自己的满意度达到最大。

满意度是指所购买的每件物品的价格与重要度的乘积的总和，假设设第i*i*件物品的价格为v[i]*v*[*i*]，重要度为w[i]*w*[*i*]，共选中了k*k*件物品，编号依次为j_1,j_2,...,j_k*j*1,*j*2,...,*j**k*，则满意度为：v[j_1]*w[j_1]+v[j_2]*w[j_2]+ … +v[j_k]*w[j_k]*v*[*j*1]∗*w*[*j*1]+*v*[*j*2]∗*w*[*j*2]+…+*v*[*j**k*]∗*w*[*j**k*]。（其中 * 为乘号）

请你帮助王强计算可获得的最大的满意度。

```java
import java.util.Scanner;

//加了限制条件的背包问题
public class Main {
	public static int getMaxValue(int[] val, int[] weight, int[] q, int n, int w) {
		int[][] dp = new int[n + 1][w + 1];
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= w; j++) {
				if (q[i-1] == 0) {  // 主件
					if (weight[i - 1] <= j) // 用j这么多钱去买 i 件商品 可以获得最大价值 
						dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j- weight[i - 1]]+ val[i - 1]);
				} 
                else { //附件
					if (weight[i - 1] + weight[q[i - 1]] <= j) //附件的话 加上主件一起算
						dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j- weight[i - 1]]+ val[i - 1]);
				}
			}
		}
		return dp[n][w];
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while (input.hasNextInt()) {
			int n = input.nextInt(); // 总钱数
			int m = input.nextInt(); // 商品个数
			int[] p = new int[m];
			int[] v = new int[m];
			int[] q = new int[m];
			for (int i = 0; i < m; i++) {
				p[i] = input.nextInt();        // 价格
				v[i] = input.nextInt() * p[i]; // 价值
				q[i] = input.nextInt();        // 主or附件
			}
			System.out.println(getMaxValue(v, p, q, m, n));
		}
	}
}
```

