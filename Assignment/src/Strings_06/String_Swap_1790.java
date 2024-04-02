package Strings_06;

import java.util.*;
public class String_Swap_1790
{
    public static void main(String[] args)
    {
        String s1 = "bank", s2 = "kanb";
        System.out.println(areAlmostEqual(s1,s2));

    }
    public static boolean areAlmostEqual(String s1, String s2)
    {
        char[] a=s1.toCharArray();
        char[] b=s2.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
//        System.out.println(String.valueOf(a));
//        System.out.println(Arrays.toString(b));
        if(!(String.valueOf(a).equals(String.valueOf(b))))
            return false;
        int c=0;
        for(int i=0;i<s1.length();i++)
        {
            if(s1.charAt(i) != s2.charAt(i))
                c++;
        }
        System.out.println("I am here");
        if(c>2) return false;
        else return true;
    }
}
