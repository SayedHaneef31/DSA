package First_JAVA_02;
//Take 2 numbers as input and print the largest number.

import com.sun.jdi.PathSearchingVirtualMachine;

import java.util.*;
public class FIFTH
{
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("ENTER TWO NO.");
        int a=sc.nextInt();
        int b=sc.nextInt();
        if(a>b)
            System.out.println(a+" is greater");
        else
            System.out.println(b+" is geater");

    }
}
