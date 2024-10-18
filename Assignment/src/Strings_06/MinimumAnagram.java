package Strings_06;

public class MinimumAnagram
{
    public static int minAnagramLength(String s)
    {
        boolean[] alpha=new boolean[26];
        for(int i=0;i<s.length();i++)
        {
            char ch= s.charAt(i);
            // int a=(int)ch;
            alpha[ch-97]=true;
        }
        int c=0;
        for(int i=0;i<s.length();i++)
        {
            if(alpha[i]==true)c++;
        }
        return c;

    }

    public static void main(String[] args) {
        System.out.println(minAnagramLength("cdef"));
    }


}
