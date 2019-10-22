package leetcode.queue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author non
 * @version 1.0
 * @date 2019/9/15 21:40
 */
//输入课程的数目numCourse，以及多个组的先决条件，这多个先决条件是否能同时满足。第一组中1在2前，
// 剩下所有的组中1都要在2前，才算满足。
public class CourseSchedule {
    public boolean canFinish(int numCourse, int[][] prerequisites) {
        List<Integer>[] adj = new List[numCourse];
        int[] indegree = new int[numCourse];
        for (int i = 0; i < numCourse; i++) adj[i] = new ArrayList<>();
        for (int[] req : prerequisites) {
            adj[req[1]].add(req[0]);
            indegree[req[0]]++;
        }

        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < numCourse; i++)
            if (indegree[i] == 0) q.offer(i);

        int cnt = 0;
        for (; !q.isEmpty(); cnt++)
            for (int crs : adj[q.poll()])
                if (--indegree[crs] == 0) q.offer(crs);
        return cnt == numCourse;
    }
}
