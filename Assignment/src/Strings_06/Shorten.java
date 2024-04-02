package Strings_06;
import java.util.*;
public class Shorten
{
    public static void main(String[] args)
    {
        char[] chars={'a','b','b','b','b','b','b'};
        if(chars.length==1) System.out.println(1);
        Arrays.sort(chars);
        int c=0;
        String s="";
        for(int i=0;i<chars.length-1;i++)
        {
            char ch=chars[i];
            char ch1=chars[i+1];
            if(ch==ch1)
            {
                c++;

            }
            else
            {
                if(c==0)
                    s=s+ch;
                else
                    s=s+ch+(c+1);
                c=0;
            }

        }
        System.out.println(s.length());
        System.out.println(s);

    }
}
