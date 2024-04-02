package Recursion_08;

import java.util.Scanner;

public class LengthString
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println(count("haneef",0,0));

    }
    static int count(String s,int i,int c)
    {
        if(i==s.length()) return c;

        c++;
        return count(s,i+1,c);
    }
}
