package algorithm.datastructure.collection;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @author non
 * @version 1.0
 * @date 2019/8/28 18:29
 */
public class DequeDemo {
    public static void main(String[] args) {
        Deque deque = new ArrayDeque();
        for (int i = 0; i < 10; i++) {
            deque.offer(i);
        }

        System.out.println(deque);

        deque.offerFirst("aaaaa");
        deque.offerLast('z');
        Object[] obj = deque.toArray();
        for (Object o : obj) {
            System.out.print(o);
        }
    }
}
