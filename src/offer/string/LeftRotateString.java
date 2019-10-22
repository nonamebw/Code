package offer.string;
/*左旋转字符串
        字符序列S=”abcXYZdef”,要求输出循环左移3位后的结果，即“XYZdefabc”。*/
public class LeftRotateString {
    public String LeftRotateString(String str,int n) {
        if(str.length()<=0 || n<0){
            return "";
        }
        String s1 = str.substring(0,n);  //去字串，包含起始0，不包含结束n
        String s2 = str.substring(n,str.length());
        return s2 + s1;

    }
}
