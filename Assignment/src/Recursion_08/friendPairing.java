package Recursion_08;
import java.util.*;
public class friendPairing
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println(pair(3));
    }
    static int pair(int n)
    {
        if(n==1 || n==2)
            return n;
        int fnm1=pair(n-1);

        int fnm2=pair(n-2);
        int pairWays=(n-1)*fnm2;

        int totalWays=fnm1+pairWays;
        return totalWays;
    }

}

