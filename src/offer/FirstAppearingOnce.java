package offer;
/*字符流中第一个不重复的字符
        请实现一个函数用来找出字符流中第一个只出现一次的字符。例如，当从字符流中只读出
        前两个字符"go"时，第一个只出现一次的字符是"g"。当从该字符流中读出前六个字符
        “google"时，第一个只出现一次的字符是"l"。*/
public class FirstAppearingOnce {
    //用一维数组建立简单的hash表实现
    int[] hashtable=new int[256];
    StringBuffer s=new StringBuffer();
    //Insert one char from stringstream
    public void Insert(char ch)
    {
        s.append(ch);
        hashtable[ch]++;
    }
    //return the first appearence once char in current stringstream
    public char firstAppearingOnce()
    {
        char[] str=s.toString().toCharArray();
        for(char c:str)
        {
            if(hashtable[c]==1)
                return c;
        }
        return '#';
    }
}
