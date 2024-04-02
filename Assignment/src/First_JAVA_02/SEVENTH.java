package First_JAVA_02;
//To calculate Fibonacci Series up to n numbers.

import java.util.*;
public class SEVENTH
{
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the limit");
        int n=sc.nextInt();
        int a=0;
        int b=1;
        int sum;
        System.out.print("0 1 ");
        for(int i=2;i<n;i++)
        {
            sum=a+b;
            System.out.print(sum+" ");
            a=b;
            b=sum;
        }
    }
}

