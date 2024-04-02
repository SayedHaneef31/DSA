package Recursion_08;
import java.util.*;
public class duplicateRecursion
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        dupli("appnacollege",0,new StringBuilder(""),new boolean[26]);

    }
    static void dupli(String str,int index,StringBuilder newStr,boolean map[])
    {
        if(index==str.length())
        {
            System.out.println(newStr);
            return;
        }
        char currentChar=str.charAt(index);
        if(map[currentChar-'a']== true)
            dupli(str,index+1,newStr,map);
        else
        {
            map[currentChar-'a']=true;
            dupli(str,index+1,newStr.append(currentChar),map);

        }

    }
}
