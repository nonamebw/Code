package leetcode;

/**
 * @author non
 * @version 1.0
 * @date 2019/9/8 23:49
 */
//字符串中不能出现三个连续的L，最多也只能有一个A
public class CheckRecord {
    public boolean checkRecord(String s) {
      /*  indexOf：查找某个字符串在字符串首次出现的位置
        lastIndexOf：从右向左查找某个字符串在字符串中最后一次出现的位置*/
        if(s.indexOf("A") != s.lastIndexOf("A") || s.contains("LLL"))
            return false;
        return true;
    }

    public boolean checkRecord2(String s) {
        return !s.matches(".*LLL.*|.*A.*A.*");
    }
}
