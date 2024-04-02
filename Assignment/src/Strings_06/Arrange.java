package Strings_06;

import java.util.*;
public class Arrange
{
    public static void main(String[] args)
    {
        String s1=("Myself2 Me1 I4 and3");
        String k=sortSentence(s1);
        System.out.println(k);

//
//
//
//        Input: s = "Myself2 Me1 I4 and3"
//        Output: "Me Myself and I"
//

    }
    public static String sortSentence(String s)
    {
        String str[]=new String[s.split(" ").length];
        s=s+" ";
        //System.out.println(Arrays.toString(str));
        String p="";
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch!=' ')                                                                       //Input: s = "is2 sentence4 This1 a3 "
                p+=ch;                                                                        //Output: "This is a sentence"
            else
            {
                char ch1=p.charAt(p.length()-1);
                int a =Character.getNumericValue(ch1);
                p=p.substring(0,p.length()-1);
                System.out.println("p and a currently is="+p +"    "+a);
                str[a-1]=p;
                p="";
            }
        }
        s="";
        for(int i=0;i<str.length;i++)
        {
            s=s+(str[i]+" ");
        }
        return s;
    }
}

