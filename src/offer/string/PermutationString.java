package offer.string;
/*字符串的排序
        输入一个字符串,按字典序打印出该字符串中字符的所有排列。例如输入字符串abc,
        则打印出由字符a,b,c所能排列出来的所有字符串abc,acb,bac,bca,cab和cba。

 采用递归的思想：
把需要全排列的字符串分为两部分看待：
（1）字符串的第一个字符；
（2）第一个字符后面的所有字符；
求所有可能出现在第一个位置的字符；将第一个字符和后面的字符一次交换；
固定第一个字符，对第一个字符后面的所有字符求全排列。第一个字符后面的所有字符又可以分为两部分；
*/
import java.util.*;

public class PermutationString {

    public  ArrayList<String> Permutation(String str){

        ArrayList<String> list = new ArrayList<String>();
        if(str!=null && str.length()>0){
            PermutationHelper(str.toCharArray(),0,list);
            Collections.sort(list);
        }
        return list;
    }
    private void PermutationHelper(char[] chars,int i,ArrayList<String> list){
        if(i == chars.length-1){
            list.add(String.valueOf(chars));
        }else{
            Set<Character> charSet = new HashSet<Character>();
            for(int j=i;j<chars.length;++j){
                if(j==i || !charSet.contains(chars[j])){
                    charSet.add(chars[j]);
                    swap(chars,i,j); //将第一个字符与后面的字符交换
                    PermutationHelper(chars,i+1,list); //对后面所有的字符进行全排列
                    swap(chars,j,i);
                }
            }
        }
    }

    private void swap(char[] cs,int i,int j){
        char temp = cs[i];
        cs[i] = cs[j];
        cs[j] = temp;
    }

    public static void main(String[] args) {
        ArrayList<String> result =  new PermutationString().Permutation("abcd");
        for (String s : result) {
            System.out.println(s);
        }
    }
}
