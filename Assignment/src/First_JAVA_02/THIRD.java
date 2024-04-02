package First_JAVA_02;
//Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
import java.util.*;
public class THIRD
{
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter principal, time, and rate  ");
        double p=sc.nextDouble();
        double t=sc.nextDouble();
        double r=sc.nextDouble();
        System.out.println("Simple Interest is="+((p*r*t)/100));

    }
}
