package tool;

import java.util.Scanner;

/**
 * @author non
 * @version 1.0
 * @date 2019/7/27 22:35
 */
 /*   nextlnt():只读取int值，就是只能读取整数类型的数据，如果输入了非整型的数据（浮点型字符串等）
            就会报错。nextFloat（）、nextDouble（）这些也是以此类推，只能读取符合该类型的数据。
            此处重点讲一下next()和nextLine()的区别
        next():只读取输入直到空格。它不能读两个由空格或符号隔开的单词。此外，
            next()在读取输入后将光标放在同一行中。(next()只读空格之前的数据,并且光标指向本行)
        nextLine():读取输入，包括单词之间的空格和除回车以外的所有符号(即。它读到行尾)。
            读取输入后，nextLine()将光标定位在下一行。*/

public class ScannerDemo {
    public static void main(java.lang.String[] args) {
         /*nextInt();*/
        /*nextAndNextline_1();*/
        test_2();
    }

    public static void nextAndNextline(){
        //读取一行输入流，一行输入流以回车结束。
        // next()读取输入到空格，读取光标在当行。
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个字符串（中间能加空格或符号）");
        java.lang.String a = scanner.nextLine();
        System.out.println(a);
        System.out.println("请输入一个字符串（中间不能加空格或符号）");
        java.lang.String b = scanner.next();
        System.out.println(b);
    }

    public static void nextAndNextline_1(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个字符串（中间能加空格或符号）");
        java.lang.String a = scanner.next();
        System.out.println(a);
        java.lang.String b = scanner.next();
        System.out.println(b);
        java.lang.String c = scanner.next();
        System.out.println(c);
    }

    public static void nextInt(){
        //想读取一个整数。读到空格和回车也会继续往下读。读到错误类型就报错。
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个整数");
        int a = scanner.nextInt();
        System.out.println(a);
    }

    public static void test_1(){
        //输入两行不定长的数组
        Scanner scanner = new Scanner(System.in);
        java.lang.String a = scanner.nextLine();
        java.lang.String b = scanner.nextLine();
        java.lang.String[] c = a.split(" ");
        java.lang.String[] d = b.split(" ");
        int[] e = new int[c.length];
        int[] f = new int[d.length];
        for(int i=0;i<c.length;++i){
            e[i] = Integer.parseInt(c[i]);
            System.out.print(e[i]);
        }
        System.out.println();
        for(int i=0;i<d.length;++i){
            f[i] = Integer.parseInt(d[i]);
            System.out.print(f[i]);
        }
    }

    public static void test_2(){
        Scanner scan = new Scanner(System.in);	//构造Scanner类的对象scan，接收从控制台输入的信息
        System.out.println("请输入你的姓名");
        java.lang.String name = scan.nextLine();//接收一个字符串，可以加除Enter以外的所有符号，包括空格和Tab
        System.out.println("请输入你的ID");
        java.lang.String ID ;
        while(scan.hasNextLine()) {// hasNextLine()方法判断当前是否有输入，当键盘有输入后执行循环
            if(scan.hasNextInt()) {// 判断输入的值是否为整数类型，当为整数类型时执行循环
                ID = scan.nextLine();
                System.out.println("你输入的姓名为："+name);
                System.out.println("你输入的ID为："+ID);
                break;
            }else {
                System.out.println("请输入数字哦！");
                ID = scan.nextLine();
                System.out.println("你输入的错误ID为:" + ID);
                continue;
            }
        }
    }
    public static void test_3(){
/*      第一行只包含2个数字，且第一个数字指示了第二行数组的长度。
        4 3
        1 2 3 4*/
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int D = sc.nextInt();
        int[] dist = new int[N];
        for (int i = 0; i < N; i++) {
            dist[i] = sc.nextInt();
        }
    }

    public static void test_4(){
        //第一行输入一个数字n，表示方阵大小
        //剩下的n行，每行数字间用空格分离，每行都是方阵元素
/*      4
        0 2 6 5
        2 0 4 4
        6 4 0 2
        5 4 2 0 */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] map = new int[n][n];
        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                map[i][j] = in.nextInt();
            }
        }
    }
}
