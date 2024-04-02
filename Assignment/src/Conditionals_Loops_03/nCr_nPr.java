package Conditionals_Loops_03;
//Find Ncr & Npr

import java.util.*;
public class nCr_nPr
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n and r");
        int n=sc.nextInt();
        int r=sc.nextInt();
        int nf=1,rf=1,nrf=1;
        for (int i=1;i<=n;i++)
        {
            nf=nf*i;
        }
        for (int i=1;i<=r;i++)
        {
            rf=rf*i;
        }
        for (int i=1;i<=(n-r);i++)
        {
            nrf=nrf*i;
        }
        System.out.println("Permutation is= "+(nf/(nrf*rf)));
        System.out.println("Combiation is= "+(nf/nrf));
    }
}

