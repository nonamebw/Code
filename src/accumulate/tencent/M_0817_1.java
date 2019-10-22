package accumulate.tencent;

import java.util.LinkedList;
import java.util.Scanner;
import java.lang.StringBuilder;
//HG[3|B[2|CA]]F
public class M_0817_1 {
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        String inString = scanner.nextLine();
        LinkedList<String> iiinStack = new LinkedList<>();
        StringBuilder str;
        StringBuilder ssstrTmp;
        for(int i = 0 ; i < inString.length(); ++i) {
            if(inString.charAt(i) != ']') {
                String t = String.valueOf(inString.charAt(i));
                iiinStack.push(t);
                continue;
            }
            str = new StringBuilder();
            ssstrTmp = new StringBuilder();
            int numm = 0;
            int m10 = 1;

            String tmp = iiinStack.pop();
            while(tmp.charAt(0) != '[')
            {
                if(tmp.charAt(0) == '|');
                else if(tmp.charAt(0) >= '0' && tmp.charAt(0)<='9')
                {
                    numm = numm + ((int)(tmp.charAt(0) - '0'))*m10;
                    m10 = m10*10;
                }
                else{
                    ssstrTmp.insert(0,tmp);
                }
                tmp = iiinStack.pop();
            }
            for(int j = 0 ; j < numm ; ++j) str.append(ssstrTmp.toString());
            iiinStack.push(str.toString());
        }

        str = new StringBuilder();
        while(iiinStack.size() != 0)
        {
            str.insert(0, iiinStack.pop());
        }
        System.out.println(str.toString());
    }
}