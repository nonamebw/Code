package leetcode.again;

/**
 * @author xuchen.pbw
 * @description
 * @date 2022/4/20
 *
 * 题目：有效的括号
 */
public class Again20 {
    public boolean isValid(String s) {
        int length = s.length() / 2;
        for (int i = 0; i < length; i++) {
            s = s.replace("()", "").replace("{}", "").replace("[]", "");
        }

        return s.length() == 0;
    }
}
