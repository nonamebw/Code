package leetcode;

import java.util.Arrays;

/**
 * @author non
 * @version 1.0
 * @date 2019/8/26 18:20
 */
/*Given a char array representing tasks CPU need to do. It contains capital letters A to Z where different letters
        represent different tasks.Tasks could be done without original order. Each task could be done in one interval.
        For each interval, CPU could finish one task or just be idle.
        However, there is a non-negative cooling interval n that means between two same tasks,
        there must be at least n intervals that CPU are doing different tasks or just be idle.
        You need to return the least number of intervals the CPU will take to finish all the given tasks.
        Example 1:
        Input: tasks = ['A','A','A','B','B','B'], n = 2
        Output: 8
        Explanation: A -> B -> idle -> A -> B -> idle -> A -> B.
        这道题让我们安排CPU的任务，规定在两个相同任务之间至少隔n个时间点
        这道题好在没有让我们输出任务安排结果，而只是问所需的时间总长，那么我们就想个方法来快速计算出所需时间总长即可。
        我们仔细观察上面两个例子可以发现，都分成了(mx - 1)块，再加上最后面的字母，其中mx为最大出现次数。比如例子1中，
        A出现了4次，所以有A---模块出现了3次，再加上最后的A，每个模块的长度为4。例子2中，CE-出现了2次，再加上最后的CE，
        每个模块长度为3。我们可以发现，模块的次数为任务最大次数减1，模块的长度为n+1，最后加上的字母个数为出现次数最多的任务，
        可能有多个并列。*/
public class LeastInterval {
    public int leastInterval(char[] task,int n){
        int[] res = new int[26];
        for (char c : task) {
            ++res[c - 'A' ];
        }

        Arrays.sort(res);
        int i = 25;
        int max = res[25];
        int len = task.length;
        while (i>=0 && res[i]==max)
            --i;
        return Math.max(len,(max-1)*(n+1)+25-i);
    }
}
