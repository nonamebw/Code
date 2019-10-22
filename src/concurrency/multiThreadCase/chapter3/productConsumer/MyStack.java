package concurrency.multiThreadCase.chapter3.productConsumer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author non
 * @version 1.0
 * @date 2019/9/26 11:06
 */
public class MyStack {
    private List list = new ArrayList();
    synchronized public void push(){
        try{
            while (list.size()==1){
                this.wait();
            }
            list.add("anyString = " + Math.random());
            this.notify();
            System.out.println("push = " + list.size());
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    synchronized public String pop(){
        String returnValue = "";
        try {
            while (list.size()==0){
                System.out.println("pop操作中的："
                        + Thread.currentThread().getName() + "   线程呈wait状态");
                this.wait();
            }
            returnValue = ""+list.get(0);
            list.remove(0);
            this.notify();
            System.out.println("pop="+ list.size());
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        return returnValue;
    }
}
