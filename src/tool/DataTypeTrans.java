package tool;

import java.util.Set;

/**
 * @author non
 * @version 1.0
 * @date 2019/7/28 13:52
 */
public class DataTypeTrans {
    public static void main(java.lang.String[] args) {
        /*test_1();*/
        test_2();
    }

    public static void test_1(){
        java.lang.String a = "aa#bb#cc#dd#ee#ff*gg*hh";
        System.out.println(a);
        java.lang.String[] b = a.split("#"); //字符串分割为字符数组
        for (java.lang.String c : b){
            System.out.println(c);
        }
    }

    public static void test_2(){
        java.lang.String a = "ab e f**gg##";
        System.out.println(a);
        char[] b = a.toCharArray();     //字符串转换为字符数组
        for (char c : b){
            System.out.println(c);
        }

        java.lang.String d = java.lang.String.valueOf(b);  //字符数组转换为字符串
        System.out.println(d);
    }

    public static void test3(){
        java.lang.String str = "2";

        int strInt = Integer.parseInt(str); //字符串转数字
        Integer strInteger = Integer.valueOf(strInt); //基本数据类型int转换为引用数据类型Integer
        byte strByte = Byte.parseByte(str);
        float strFloat = Float.parseFloat(str);

        char strChar = str.charAt(0);    //字符串取字符

        java.lang.String strString = java.lang.String.valueOf(strFloat); //基本数据类型、数组转换为字符串
        java.lang.String strIntegerString = Integer.toString(strInt);  //
        java.lang.String strByteString = Byte.toString(strByte);
    }
}
