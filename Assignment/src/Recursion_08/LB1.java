package Recursion_08;

import java.util.*;
public class LB1
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=0000002;
        printt(a);
    }
    static void printt(int n)
    {
        if(n<=0)
            return;

        printt(n/10);
        System.out.println(n%10);
    }
}
