package algorithm.datastructure.collection;

import java.util.List;
import java.util.Vector;

/**
 * @author non
 * @version 1.0
 * @date 2019/8/27 9:47
 */
public class VectorDemo {
    public static void main(String[] args) {
        Vector vector = new Vector<>(10); //申请一个初始容量大小为10的Vector
        for (int i = 0; i < 5; i++) { //初始化元素为
            vector.add(i);
        }
        System.out.println("此时数组实际大小为: " + vector.size());
        printVector("Vector此时元素有", vector);
        vector.set(4,44); //设置第5个元素为44
        vector.add(2,22); //在第3个元素位置增加22
        printVector("Vector此时元素有", vector);
        vector.add(2);
        System.out.println("第1次出现2的位置为: " + vector.indexOf(2));
        vector.remove(2); //删除第3个元素
        vector.remove((Object)44); //删除第一次出现的44
        printVector("Vector此时元素有", vector);
        int size = vector.size();
        for (int i = size; i < size + 6; i++) {
            vector.add(i);
        }
        printVector("Vector此时元素有", vector);
        System.out.println("Vector此时大小为: " +  vector.size());
        System.out.println("Vector此时的容量为: " + vector.capacity()); //原有容量为10, 超出容量后新容量为2倍

        //转为数组
        Integer [] arr = (Integer[]) vector.toArray(new Integer[0]);
        System.out.print("遍历数组结果: ");
        for (Integer i:arr) {
            System.out.print(i + " ");
        }
    }

    /**
     * 打印Vector
     */
    protected static void printVector(String comment, List vector) {
        System.out.print(comment + ": ");
        for (int i = 0; i < vector.size(); i++) {
            System.out.print(vector.get(i) + " ");
        }
        System.out.println("");
    }
}
