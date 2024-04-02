package Conditionals_Loops_03;
//Calculate Distance Between Two Points


import java.util.*;
public class Distance
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two no.");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=0;
        int min=a,max=0;
        if(a<b)
        {
            min=a;
            max=b;
        }
        else
        {
            min=b;
            max=a;
        }

        for (int i=min;i<max;i++ )
        {
            c++;
        }
        System.out.println("Distance betwwen two nos. is "+c);
    }
}

