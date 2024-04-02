package First_JAVA_02;
//To find out whether the given String is Palindrome or not.

import java.util.*;
public class EIGHTH
{
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        String s= new String();
        System.out.println("Enter a String");
        s=sc.nextLine();
        String r="";
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            r=ch+r;
        }
       if (r.equals(s))
           System.out.println("Enterd string is palindrome");
       else
           System.out.println("Enterd string is not palindrome");
    }
}
