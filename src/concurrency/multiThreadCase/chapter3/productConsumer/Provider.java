package concurrency.multiThreadCase.chapter3.productConsumer;

/**
 * @author non
 * @version 1.0
 * @date 2019/9/26 11:19
 */
public class Provider {
    private MyStack myStack;
    public Provider(MyStack myStack){
        super();
        this.myStack = myStack;
    }

    public void pushService(){
        myStack.push();
    }
}
