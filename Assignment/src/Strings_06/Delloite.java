package Strings_06;
//Write a program to return the index of first non repeating character in the given string...If not return -1
import java.util.*;
public class Delloite
{
    public static void main(String[] args) {
        System.out.println(GetIndex("dcf"));
    }

    static int GetIndex(String str)
    {
        char[] s=str.toCharArray();
        Arrays.sort(s);
        int c=0;
        int i;
        for(i=0;i<s.length-1;i++)
        {
            if(s[i]==s[i+1]) {
                c++;
                continue;
            }
            if( s[i]!=s[i+1] && c==0 )  // the character is not repeated
            {
                break;   // s[i] waala element
            }
            else c=0;
        }
        return str.indexOf(s[i]);
    }
}
