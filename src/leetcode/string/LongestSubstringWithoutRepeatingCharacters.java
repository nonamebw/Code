package leetcode.string;

import java.util.HashMap;

/**
 * @author non
 * @version 1.0
 * @date 2019/10/8 11:12
 */
//最长无重复字串
//维护两个指针，右指针一直往后遍历并往HashMap里存字符位置。
// 遇到相同的字符就把左指针放在（左边）相同字符的下一个位置，并更新这个相同字符的位置
public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        if (s.length()==0) return 0;
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        int max=0;
        for (int i=0, j=0; i<s.length(); ++i){  //有指针
            if (map.containsKey(s.charAt(i))){
                j = Math.max(j,map.get(s.charAt(i))+1); //左指针
            }
            map.put(s.charAt(i),i);
            max = Math.max(max,i-j+1);
/*            String res = "";
            if (max<i-j+1){
                max = i-j+1;
                res = s.substring(j,i+1);
            }*/
        }
        return max;
    }
}
