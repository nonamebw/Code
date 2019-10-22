package accumulate.cvte;

/**
 * @author non
 * @version 1.0
 * @date 2019/9/15 19:55
 */
public class M2 {
    public static String noticeTime(String deadline,String time, String[] starts){
        String[] strDL = deadline.split(":");
        String[] strTI = time.split(":");
        int intDL = Integer.valueOf(strDL[0])*60 + Integer.valueOf(strDL[1]);
        int intTI = Integer.valueOf(strTI[0])*60 + Integer.valueOf(strTI[1]);
        int temp = intDL - intTI;
        int[] res = new int[starts.length];
        for (int i = 0; i < starts.length; i++) {
            String hour = starts[i].substring(0,2);
            String minte = starts[i].substring(3,5);
            int tt = Integer.valueOf(hour)*60 + Integer.valueOf(minte);
            res[i] = tt;
        }
        int minTime = 0;
        for (int i = 0; i < res.length; i++) {

            if (intDL - res[i]>temp)
                minTime = Math.min(minTime,res[i]);
        }
        return minTime%60 + ":" + minTime/60;
    }
}
