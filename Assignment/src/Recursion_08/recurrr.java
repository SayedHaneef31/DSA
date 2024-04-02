package Recursion_08;
import java.util.*;
public class recurrr
{
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("enter a number");
        int a= sc.nextInt();
        System.out.println(fun(a,0));

    }
    static int fun(int n, int s)
    {
        if(n==0)
            return s;
        s=s+n%10;
        return fun(n/10,s);

    }
}
