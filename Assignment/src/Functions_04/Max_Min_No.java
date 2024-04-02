package Functions_04;
//Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.

import  java.util.*;
public class Max_Min_No
{
     static int max(int a,int b,int c)
    {

        if(a>=b && a>=c)
            return a;
        else if (b>=a && b>=c)
            return b;
        else if (c>=b && c>=a)
            return c;
        else
            return 0;
    }
    public int min(int a,int b,int c)
    {
        if (a<=b && a<=c)
            return a;
        if (b<=a && b<=c)
            return b;
        if (c<=b && c<=a)
            return c;
        else
            return 0;               //Ye return extra is liye add karna par gaya quqi value to return honi hi hai...therefore programm except hi nahi kar raha tha
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        Max_Min_No obj= new Max_Min_No();
        System.out.println("Enter three no.");
        int x=sc.nextInt();
        int y=sc.nextInt();
        int z=sc.nextInt();
        int maximum= max(x,y,z);
        int minimum=obj.min(x,y,z);
        if (x==y && y==z)
        {
            System.out.println("You inputted all the same no.");
            System.exit(0);
        }
        if (x!=y && y!=z)
        {
            System.out.println("Maximum no. is= "+maximum);
            System.out.println("Minimum no. is= "+minimum);
            System.exit(0);

        }
        if (x==y || x==z || y==z )
        {
            System.out.println("You had inputted two nos. same....BUT KOI NI");
//            System.out.println(maximum);
            System.out.println("Maximum no. is= "+maximum);
            System.out.println("Minimum no. is= "+minimum);
        }
    }
}
