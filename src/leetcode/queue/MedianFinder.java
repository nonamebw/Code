package leetcode.queue;

import java.util.Collections;
import java.util.PriorityQueue;

/**
 * @author non
 * @version 1.0
 * @date 2019/10/7 16:38
 */
//数据流中的中位数，最大堆、最小堆思想实现。
public class MedianFinder {
    //优先队列实现最小堆，数据元素从小到大排列，队列头始终是堆最大元素。
    PriorityQueue<Integer> min = new PriorityQueue();
    //优先队列实现最大堆，数据元素从大到小排列，队列头始终是堆最小元素
    PriorityQueue<Integer> max = new PriorityQueue(1000, Collections.reverseOrder());
    // Adds a number into the data structure.
    public void addNum(int num) {
        max.offer(num);   //先把数字加入最大堆中
        min.offer(max.poll()); //把最大堆中的队列头加入到最小堆中
        // max queue is always larger or equal to min queue
        if (max.size() < min.size()){
            max.offer(min.poll());
        }
    }

    // Returns the median of current data stream
    public double findMedian() {
        if (max.size() == min.size()) return (max.peek() + min.peek()) / 2.0;
        else return max.peek();
    }
}
