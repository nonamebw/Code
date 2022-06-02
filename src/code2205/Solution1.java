//package code2205;
//
//import java.util.*;
//
///**
// * @author xuchen.pbw
// * @description
// * @date 2022/5/16
// *
// * 字符串的排列：
// * 两个字符串S1和S2，写一个函数判断S2是否包含S1的排列，如果是，返回true；否则，返回false
// * 例1：s1="ab"   s2="eidbaooo"   输出：true；s2包含ba的排列
// *
// * 例2：s1="ab" s2="eidboaoo"     输出：false；
// */
//public class Solution1 {
//
//    public static boolean get(String s2,String s1){
//        if (s1.isEmpty() || s2.isEmpty() || s1.length() > s2.length()) return false;
//        int s1Len = s1.length();
//        int s2Len = s2.length();
//        for (int i=0; i<=s2Len-s1Len; i++){
//            String tmp = s2.substring(i,i+s1Len);
//            boolean res = helper(s1,tmp);
//            if (res){
//                return true;
//            }
//        }
//        return false;
//    }
//
//    public static boolean helper(String str1, String str2) {
//        char[] charArr = str1.toCharArray();
//        Map<Character,Integer> map = new HashMap<>();
//        for (int i = 0; i < charArr.length; i++) {
//           if ( map.containsKey(charArr[i])) {
//               int tmp = map.get(charArr[i]);
//               tmp++;
//               map.put(charArr[i],tmp);
//           }else {
//               map.put(charArr[i], 1);
//           }
//        }
//
//        char[] charr2 = str2.toCharArray();
//        for (int i = 0; i < charr2.length; i++) {
//            if (map.containsKey(charr2[i])) {
//                int tmp = map.get(charr2[i]);
//                tmp--;
//                map.put(charr2[i],tmp);
//            }else {
//                return false;
//            }
//        }
//        for (Integer integer : map.values()) {
//            if (integer!=0) {
//                return  false;
//            }
//        }
//        return true;
//    }
//
//    public static void main(String[] args) {
//        String s1 = "ab";
//        String s2 = "eidboaoo";
//        boolean res = get(s2,s1);
//
//
////        List list= new ArrayList();
////        Iterator iterator =  list.iterator();
////        boolean hasNext = iterator.hasNext();
////        Object object = iterator.next();
//        char c = 'o';
//        String tmp = c + "";
//        System.out.println( s2.replace(tmp,""));
//    }
//
//    public String reverseLeftWords(String s, int n) {
//        if(n>s.length()) return s;
//        List list= new ArrayList();
//        String.join();
//        String left = s.substring(0,n+1);
//        String right = s.replace(left,"");
//        return right + left;
//    }
//}
