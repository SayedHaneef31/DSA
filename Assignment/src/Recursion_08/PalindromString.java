package Recursion_08;

public class PalindromString
{
    public static void main(String[] args)
    {
        String s="mommmmmmom ";
        System.out.println(isPalin(s,0,s.length()-1));

    }
    static boolean isPalin(String str,int s,int e)
    {
        //base case
        if(s>=e)
        {
            return true;
        }
        char ch=str.charAt(s);
        char ch1=str.charAt(e);
        if(ch==ch1)
            return isPalin(str,s+1,e-1);
        else return false;
    }
}
