package accumulate.iqiyi;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n = scanner.nextDouble();
        double m = scanner.nextDouble();
        double result = getvalue(n,m);
        String str = String.format("%.5f",result);
        System.out.println(str);
    }

    private static double getvalue(double n, double m){
        if (n==0.0)
            return 0;
        else if (m<=0.0)
            return 1.0;
        double temp = n/(n+m);
        double res = (m/(n+m)*(m-1)/(n+m-1));
        double res1 = n/(n+m-2);
        double res2 = (m-2)/(n+m-2);
        return temp+ res*(res1*getvalue(n-1,m-2)+ res2*getvalue(n,m-3));
    }
}
