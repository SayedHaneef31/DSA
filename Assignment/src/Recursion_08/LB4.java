package Recursion_08;
// Subsequemce
public class LB4
{
    public static void main(String[] args) {
        printt("abc","",0);
    }

    static void printt(String up,String p,int i)
    {
        if(i>=up.length())
        {
            System.out.println(p);
            return;

        }


        //including case
        printt(up,p+up.charAt(i),i+1);

        //excluding case
        printt(up,p,i+1);

    }
}
