package accumulate.xiecheng2;


import java.util.Scanner;

/*
 * 已知IP地址和子网掩码来获得对应的网络号和主机号
 */
public class IP {
    //ip和子网掩码的实现类：如ip：192.168.43.169   子网掩码：255.255.255.0
    static class  dz{
        int ip1;//192或255
        int ip2;//168或255
        int ip3;//43或255
        int ip4;//169或0
        public int getIp1() {
            return ip1;
        }
        public void setIp1(int ip1) {
            this.ip1 = ip1;
        }
        public int getIp2() {
            return ip2;
        }
        public void setIp2(int ip2) {
            this.ip2 = ip2;
        }
        public int getIp3() {
            return ip3;
        }
        public void setIp3(int ip3) {
            this.ip3 = ip3;
        }
        public int getIp4() {
            return ip4;
        }
        public void setIp4(int ip4) {
            this.ip4 = ip4;
        }

    }
    public static int int_byte1(int n,int m) {
        byte[] b1=new byte[8];//ip地址的二进制
        byte[] b2=new byte[8];//子网掩码的二进制
        byte[] b3=new byte[8];//网络号的二进制
        int a=0;
        //将ip地址转化成二进制
        for(int i=b1.length-1;i>=0;i--) {
            b1[i]=(byte) (n%2);
            n=n/2;
        }
        //将子网掩码转换成二进制
        for(int i=b2.length-1;i>=0;i--) {
            b2[i]=(byte) (m%2);
            m=m/2;
        }
        //网络号的二进制
        for(int i=0;i<8;i++) {
            b3[i]=(byte) (b1[i]&b2[i]);
        }
        //网络号的十进制
        for(int i=7;i>=0;i--) {
            a+=(int)b3[i]*(int)Math.pow(2, 7-i);
        }
        return a;
    }

    public static int int_byte2(int n,int m) {
        byte[] b1=new byte[8];//ip地址的二进制
        byte[] b2=new byte[8];//子网掩码的二进制
        byte[] b3=new byte[8];//网络号的二进制
        byte[] b4=new byte[8];//子网掩码的二进制取反
        int a=0;
        //将ip地址转化成二进制
        for(int i=b1.length-1;i>=0;i--) {
            b1[i]=(byte) (n%2);
            n=n/2;
        }
        //将子网掩码转换成二进制
        for(int i=b2.length-1;i>=0;i--) {
            b2[i]=(byte) (m%2);
            m=m/2;
        }

        //将子网掩码的二进制取反
        for(int i=0;i<b2.length;i++) {
            if(b2[i]==1)
                b4[i]=0;
            if(b2[i]==0)
                b4[i]=1;
        }
        //主机号的二进制
        for(int i=0;i<8;i++) {
            b3[i]=(byte) (b1[i]&b4[i]);
        }
        //网络号的十进制
        for(int i=7;i>=0;i--) {
            a+=(int)b3[i]*(int)Math.pow(2, 7-i);
        }
        return a;
    }
    public static void main(String[] args) {
        dz dz1=new dz();
        dz dz2=new dz();
        Scanner scanner=new Scanner(System.in);
        String string1=scanner.nextLine();
        String string2=scanner.nextLine();
        //需要注意的是，该方法的参数是个正则表达式,要注意对某些字符做转码。
        //例如，.在正则表达式中表示任意字符，因此，如果你要通过.号做分割，需要这样写，split("\\.")
        //或者split(Pattern.quote("."))
        String ip1[]=string1.split("\\.");
        if(ip1!=null && ip1.length==4) {
            dz1.setIp1(Integer.parseInt(ip1[0]));
            dz1.setIp2(Integer.parseInt(ip1[1]));
            dz1.setIp3(Integer.parseInt(ip1[2]));
            dz1.setIp4(Integer.parseInt(ip1[3]));
        }

        String ip2[]=string2.split("\\.");
        if(ip2!=null && ip2.length==4) {
            dz2.setIp1(Integer.parseInt(ip2[0]));
            dz2.setIp2(Integer.parseInt(ip2[1]));
            dz2.setIp3(Integer.parseInt(ip2[2]));
            dz2.setIp4(Integer.parseInt(ip2[3]));
        }
        //219.224.3.18 & 255.255.255.248
        System.out.println("网络号："+
                int_byte1(dz1.getIp1(),dz2.getIp1())+"."+
                int_byte1(dz1.getIp2(),dz2.getIp2())+"."+
                int_byte1(dz1.getIp3(),dz2.getIp3())+"."+
                int_byte1(dz1.getIp4(),dz2.getIp4())
        );
        System.out.println("主机号："+
                int_byte2(dz1.getIp1(),dz2.getIp1())+"."+
                int_byte2(dz1.getIp2(),dz2.getIp2())+"."+
                int_byte2(dz1.getIp3(),dz2.getIp3())+"."+
                int_byte2(dz1.getIp4(),dz2.getIp4())
        );

    }
}
