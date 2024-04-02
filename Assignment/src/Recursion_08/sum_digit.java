package Recursion_08;

import java.util.Scanner;

public class sum_digit
{
    public static void main(String[] args)
    {
        int n = 2456;
//        System.out.println(digit_sum(10);
        System.out.println(digit_product(n));
    }
    static int digit_sum(int n)
    {
        if(n==0)
            return 0;
        return n%10+digit_sum(n/=10);
    }
    static int digit_product(int n)
    {
        if(n%10==n)
            return n;
        return n%10*digit_product(n/=10);

    }
}
