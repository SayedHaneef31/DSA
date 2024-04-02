package Recursion_08;

import java.util.Scanner;

public class num_1toN
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter any no.");
        n=sc.nextInt();
        if(n<0)
        {
            n=-1*n;
            int t=num(n);
            System.out.println(-1*t);
        }
        else System.out.println(num(n));
    }
    static int num(int n)
    {
        if(n==0)
            return 0;
        return n+num(n-1);
    }
}
