package accumulate.xiecheng;
import java.util.*;
//(asd(sa(sdas)sds))
//括号里的字符串反转，然后去括号
public class M2 {
    /*请完成下面这个函数，实现题目要求的功能
    当然，你也可以不按照下面这个模板来作答，完全按照自己的想法来 ^-^
    ******************************开始写代码******************************/
    static String resolve(String expr) {
        StringBuilder resultBuilder = new StringBuilder();
        Stack<Character> stackTemp = new Stack<>();
        for (int i = 0; i < expr.length(); i++) {
            char c = expr.charAt(i);
            stackTemp.push(c);
            if (c==')'){
                stackTemp.pop();
                StringBuilder temp = new StringBuilder();
                while (stackTemp.peek()!= '('){
                    temp.append(stackTemp.pop());
                }
                stackTemp.pop();
                String tempStr = temp.toString();
                for (int j = 0; j < tempStr.length(); j++) {
                    stackTemp.push(tempStr.charAt(j));
                }
            }
        }
        while (!stackTemp.isEmpty())
            resultBuilder.append(stackTemp.pop());
        if (resultBuilder.toString().contains("(") || resultBuilder.toString().contains(")"))
             return "";
        return resultBuilder.reverse().toString();
    }
    /******************************结束写代码******************************/


    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String res;

        String _expr;
        try {
            _expr = in.nextLine();
        } catch (Exception e) {
            _expr = null;
        }

        res = resolve(_expr);
        System.out.println(res);
    }
}

