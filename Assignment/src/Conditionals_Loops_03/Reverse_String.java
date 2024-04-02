package Conditionals_Loops_03;
//Reverse A String In Java

import java.util.*;
public class Reverse_String
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s=new String();
        System.out.println("Enter a sentence");
        s=sc.nextLine();
        String rs="";
        int i;
        for (i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            rs=ch+rs;
        }
        System.out.println("Reverse string is written below");
        System.out.println(rs);

    }
}