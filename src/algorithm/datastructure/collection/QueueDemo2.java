package algorithm.datastructure.collection;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @author non
 * @version 1.0
 * @date 2019/8/27 17:57
 */
public class QueueDemo2 {
    public static void main(String[] args) {
        Queue<Integer> queue = new PriorityQueue<Integer>();

        queue.offer(5);
        queue.offer(4);
        queue.offer(3);
        queue.offer(2);
        queue.offer(1);
        queue.offer(6);
        for (Integer o : queue) {
            System.out.println(o);
        }
    }
}
