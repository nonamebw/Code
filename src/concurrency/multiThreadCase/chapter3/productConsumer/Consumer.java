package concurrency.multiThreadCase.chapter3.productConsumer;

/**
 * @author non
 * @version 1.0
 * @date 2019/9/26 11:19
 */
public class Consumer {
    private MyStack myStack;
    public Consumer(MyStack myStack){
        super();
        this.myStack = myStack;
    }

    public void popService(){
        System.out.println("pop = " + myStack.pop() );
    }
}
