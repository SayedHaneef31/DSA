package Recursion_08;

import java.util.Scanner;

public class IntToString
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String digit[]={"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
        convert(53650,digit);
    }
    static void convert(int n,String digit[])
    {
        if(n==0) return;

        int lastDigit=n%10;
        convert(n/10,digit);
        System.out.print(digit[lastDigit]+" ");
    }
}
