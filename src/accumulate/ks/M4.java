package accumulate.ks;

import java.util.*;

/**
 * @author non
 * @version 1.0
 * @date 2019/9/16 21:20
 */
public class M4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
           arr[i] = scanner.nextInt();
        }
        Arrays.sort(arr);
        int[] res = new int[n-1];
        for (int i = 0, j=0; i <= n - 2; i++,j++) {
            int temp = arr[i+1] - arr[i];
            res[j] = temp;
        }

        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < res.length; i++) {
            if (map.containsKey(res[i])){
                int cou = map.get(res[i]);
                map.put(res[i],cou+1);
            }
            else
                map.put(res[i],1);
        }

        Collection<Integer> c = map.values();
        Object[] o = c.toArray();
        Arrays.sort(o);
        int max = 0;
        for(Map.Entry<Integer,Integer> m: map.entrySet()){
            if (m.getValue() == o[o.length-1])
                max = Math.max(m.getValue(),max);
        }

        if (max==1){
            System.out.println(0);
        }else {
            System.out.println(max+1);
        }

    }
}
