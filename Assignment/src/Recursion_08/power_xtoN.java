package Recursion_08;

import java.util.Scanner;

public class power_xtoN
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(Optimizedpower(5,3));

    }
    static int power(int x , int n )
    {
        if(n==0 ) return 1;
        int xnm1=power(x,n-1);
        int xn=x*xnm1;
        return xn;
    }
    static int Optimizedpower(int x , int n )
    {
        if(n==0 ) return 1;
        int halfPower=Optimizedpower(x,n/2);
        int halfPowerSq= halfPower* halfPower;
        if(n%2==0) return halfPowerSq;
        else return x*halfPowerSq;
    }

}
