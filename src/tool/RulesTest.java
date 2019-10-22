package tool;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author non
 * @version 1.0
 * @date 2019/8/28 9:59
 */
public class RulesTest {
    public static void main(java.lang.String[] args) {

        test12();
    }

    public static void test(){
        java.lang.String s = "";
        java.lang.String s2 = null;
        System.out.println(s==s2 );
        System.out.println(s.equals(s2));
    }

    public static void test2(){
        Integer i = new Integer(100);
        Integer i2 = new Integer(100);
        System.out.println(i==i2);   //引用的地址肯定不同
        System.out.println(i.equals(i2)); //内容相同
    }

    public static void test3(){
        int a = 2;
        int b = 3;
        swap(a,b); //java中只有值传递，无引用传递。
        System.out.println("a:"+a+" "+"b"+b);
    }

    public static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
        System.out.println("swap a:" + a + " "+ "b:" + b);
    }

    public static void test4( ){
        java.lang.String str = "#-23234&^^%%+#33r520d9f0";
        Pattern p = Pattern.compile("[(\\d+\\.\\d+)|\\d]");
        Matcher matcher = p.matcher(str);
        java.lang.String utils = matcher.replaceAll("");
        System.out.println(utils);
    }

    public static void test5(){
        int result = 'A' - 'a';
        System.out.println("'A'-'a' : "+result);
        result = 'b' -1;
        System.out.println(" 'b'-1 :"+result);
    }

    public static void test6(){
        java.lang.String str = "#-23234&^^%%+#33r520d9f0";
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i]>=48 && chars[i]<=57){

            }
        }
    }

    public static void test7(){
        int a , b = 2;
        a = 1;//在这里a才得到了初始化
        System.out.println(a);
        System.out.println(b);
    }

    public static void test8(){
        char c = 'a';
        char c2 = 'b';
        System.out.println( c2 - c);
        System.out.println( c2 - 97);
    }

    public static void test9(){
        Integer a = new Integer(128);
        int b = 128;
        Integer c = Integer.valueOf(128);
        Integer d = 128;
        System.out.println(a==b);  //true
        System.out.println(a==c);  //false 判断的是栈里的引用
        System.out.println(a==d);  //false 判断的是栈里的引用
        System.out.println(b==d);  //true
    }

    public static void test10(){
        java.lang.String str = "abc";
        System.out.println(str.contains("ab"));


        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(1);
    }

    public static void test11(){
        java.lang.String s = "a";
        System.out.println(s.substring(1,1));
    }

    public static void test12(){
        int i=0, j=0;
        i++;
        i++;
        i++;
        ++j;
        ++j;
        ++j;

        System.out.println("i:"+i+"  j:"+j);  //i=3,j=3

        i = i++;
        j = ++j;
        System.out.println("i:"+i+"  j:"+j); //i=3,j=4
    }

    public static void test13(){
        
    }
}
