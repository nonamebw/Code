package algorithm;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author non
 * @version 1.0
 * @date 2019/9/9 11:56
 */
//输入n行字符串，若某行字符串是通过另一行移位而来，就视为同一种字符串
//求输入字符串的种类
public class LoopStringType {
    public static void main(String[] args) {

    }

    private int loopStringTypt(){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<String> arrayList = new ArrayList<>();
        int count = 0;
        for (int i = 0; i < n; i++) {
            String temp = scanner.nextLine();
            //容器中是否包含这个字符串，没有就加进去
            if (!arrayList.contains(temp)){    //容器用contains方法判断某个Object是否包含在内
                arrayList.add(temp);
                count++;

                //把这个字符串的所有移位情况都求出来，并加入到容器中
                for (int j = 0; j < temp.length()-1; j++) {  //边界条件，只需要遍历length-2次
                    char last = temp.charAt(temp.charAt(temp.length()-1));  //取出最后一位
                    temp = temp.substring(0,temp.length()-1); //substring包含begin不包含end
                    temp = last + temp;
                    arrayList.add(temp);
                }
            }
        }
        return count;
    }
}
