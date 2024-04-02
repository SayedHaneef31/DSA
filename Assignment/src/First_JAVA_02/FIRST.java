//Write a program to print whether a number is even or odd, also take input from the user.
import java.util.*;
public class FIRST
{
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a no.");
        int a=sc.nextInt();
        if(a%2==0)
        System.out.println("Even no.");
        else
        System.out.println("Odd no.");

    }
}
