package accumulate.xiecheng2;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Main {


    /*请完成下面这个函数，实现题目要求的功能
    当然，你也可以不按照下面这个模板来作答，完全按照自己的想法来 ^-^
    ******************************开始写代码******************************/
    static boolean CheckBlackList(String userIP, String blackIP) {
        String[] str = blackIP.split("/");
        if (str.length==1){
            if (userIP.equals(blackIP))
                return true;
            else
                return false;
        }else {
            String[] usIP = userIP.split("\\.");
            String[] blIp = str[0].split("\\.");
            int mask = Integer.parseInt(str[1]);
            String res = "";
            if (mask<=8)
                res = Math.pow(2,mask) + ".0.0.0";
            if (8<mask && mask<=16 )
                res = "255." + Math.pow(2,mask-8)+".0.0";
            if (16<mask && mask<=24)
                res = "255.255." + Math.pow(2,mask-16)+".0";
            if (mask>24)
                res = "255.255.255." +  Math.pow(2,mask-24);

            String[]  temp = res.split("\\.");

            if (int_byte1(Integer.parseInt(usIP[0]),Integer.parseInt(temp[0])) == int_byte1(Integer.parseInt(blIp[0]),Integer.parseInt(temp[0]))
                    && int_byte1(Integer.parseInt(usIP[1]),Integer.parseInt(temp[1])) == int_byte1(Integer.parseInt(blIp[1]),Integer.parseInt(temp[1]))
                    && int_byte1(Integer.parseInt(usIP[2]),Integer.parseInt(temp[2])) == int_byte1(Integer.parseInt(blIp[2]),Integer.parseInt(temp[2]))
                    && int_byte1(Integer.parseInt(usIP[3]),Integer.parseInt(temp[3])) == int_byte1(Integer.parseInt(blIp[3]),Integer.parseInt(temp[3]))
                    )
                return true;
            else
                return false;


        }

    }


    public static int int_byte1(int n,int m) {
        byte[] b1=new byte[8];//ip地址的二进制
        byte[] b2=new byte[8];//子网掩码的二进制
        byte[] b3=new byte[8];//网络号的二进制
        int a=0;
        //将ip地址转化成二进制
        for(int i=b1.length-1;i>=0;i--) {
            b1[i]=(byte) (n%2);
            n=n/2;
        }
        //将子网掩码转换成二进制
        for(int i=b2.length-1;i>=0;i--) {
            b2[i]=(byte) (m%2);
            m=m/2;
        }
        //网络号的二进制
        for(int i=0;i<8;i++) {
            b3[i]=(byte) (b1[i]&b2[i]);
        }
        //网络号的十进制
        for(int i=7;i>=0;i--) {
            a+=(int)b3[i]*(int)Math.pow(2, 7-i);
        }
        return a;
    }





    /******************************结束写代码******************************/


    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        boolean res;

        String _userIP;
        try {
            _userIP = in.nextLine();
        } catch (Exception e) {
            _userIP = null;
        }

        String _blackIP;
        try {
            _blackIP = in.nextLine();
        } catch (Exception e) {
            _blackIP = null;
        }

        res = CheckBlackList(_userIP, _blackIP);
        System.out.println(String.valueOf(res ? 1 : 0));
    }
}
