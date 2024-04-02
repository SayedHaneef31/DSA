package Functions_04;
//Write a program to print the circumference and area of a circle of radius entered by user by defining your own method.

import java.util.*;
public class Circle
{
    static void ac(int r)
    {
        System.out.println("Area= "+(3.14*r*r));
        System.out.println("Perimeter= "+(2*3.14*r));
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter radius");
        int r1=sc.nextInt();
        ac(r1);
    }

}
