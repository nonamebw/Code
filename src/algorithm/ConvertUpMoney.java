package algorithm;

/**
 *@Title: ConvertUpMoney
 * @Description:  将数字金额转为大写汉字金额
 * @date: 2019年6月18日 下午10:52:27
 */
public class ConvertUpMoney {

    private static final String UNIT = "万千百十亿千百十万千百十元角分";
    private static final String DIGIT = "零一二三四五六七八九";
    private static final double MAX_VALUE = Double.MAX_VALUE;

    public static String change(double value) {
        if (value < 0 || value > MAX_VALUE) {
            return "参数非法!";
        }
        long money = Math.round(value * 100);
        if (money == 0) {
            return "零元整";
        }
        String strValue = money + "";
        // j用来控制单位
        int j = UNIT.length() - strValue.length();
        String rs = "";
        boolean isZero = false;
        for (int i = 0; i < strValue.length(); i++, j++) {
            char ch = strValue.charAt(i);
            if (ch == '0') {
                isZero = true;
                //0如果出现在了每一阶段的末尾
                if (UNIT.charAt(j) == '亿' || UNIT.charAt(j) == '万' || UNIT.charAt(j) == '元') {
                    rs = rs + UNIT.charAt(j);
                    isZero = false;
                }
            } else {
                if (isZero) {
                    rs = rs + "零";   //二百零三万，上一个是零且没在末尾，就不需要单位，但是要记录读数。
                    isZero = false;
                }
                rs = rs + DIGIT.charAt(ch - '0') + UNIT.charAt(j);
            }
        }
        if (!rs.endsWith("分")) {
            rs = rs + "整";
        }
        rs = rs.replaceAll("亿万", "亿");  //亿和个中间全是零
        return rs;
    }

    public static void main(String[] args) {
        System.out.println(ConvertUpMoney.change(12));
    }
}
