package Functions_04;
//Write a function to check if a given triplet is a Pythagorean triplet or not.
//A Pythagorean triplet is when the sum of the square of two numbers is equal to the square of the third number

import java.util.*;
public class Pythagorian_Triplet
{
    static boolean pytha(int n,int m,int o)
    {
       return ((n*n)+(m*m)==(o*o));
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Triplets to be checked");
        int x=sc.nextInt();
        int y=sc.nextInt();
        int z=sc.nextInt();
        if (x==y && y==z)
        {
            System.out.println("You inputted the same no.,Not a Triplet");
            System.exit(0);
        }
        int max=0;int l1=0,l2=0;
        if(x>y && x>z)
        {
            max=x;
            l1=y;
            l2=z;
        }

        if(y>x && y>z)
        {
            max=y;
            l1=x;
            l2=z;
        }

        if(z>y && z>x)
        {
            max=z;
            l1=x;
            l2=y;
        }
          boolean val=pytha(l1,l2,max) ;
        if (val==true)
            System.out.println("It is Pythagorean triplet");
        else
            System.out.println("It is not a Pythagorean triplet");


    }
}
