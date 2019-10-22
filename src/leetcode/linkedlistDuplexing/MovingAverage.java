package leetcode.linkedlistDuplexing;

import java.util.LinkedList;

/**
 * @author non
 * @version 1.0
 * @date 2019/8/26 16:38
 */
/*
Given a stream of integers and a window size, calculate the moving average of all integers in the sliding window.

        For example,
        MovingAverage m = new MovingAverage(3);
        m.next(1) = 1
        m.next(10) = (1 + 10) / 2
        m.next(3) = (1 + 10 + 3) / 3
        m.next(5) = (10 + 3 + 5) / 3*/
public class MovingAverage {
    private LinkedList<Integer> linkedList = new LinkedList<>();
    private double sum = 0;
    private int k;

    /*
     * @param size: An integer
     */
    public MovingAverage(int size) {
        // do intialization if necessary
        this.k = size;
    }

    /*
     * @param val: An integer
     * @return:
     */
    public double next(int val) {
        // write your code here
        linkedList.add(val);
        sum += val;
        if (linkedList.size() > k) {
            Integer integer = linkedList.removeFirst();
            sum -= integer;
        }
        return sum / linkedList.size();
    }
}
