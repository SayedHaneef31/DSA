package Recursion_08;

import java.util.Scanner;

public class removeAPPLE
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s="bbdfappleggh";
        System.out.println(recursion(s));
    }
    static String recursion(String s)
    {
        if (s.length()==0)
        {
            return "";
        }
        char ch = s.charAt(0);
        if (s.startsWith("apple"))
            return ""+recursion(s.substring(5));
        else
            return ch+recursion(s.substring(1));
    }
}
