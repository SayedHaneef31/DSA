package First_JAVA_02;
//Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)

import java.util.*;
public class FOURTH
{
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
//        String s1;
        System.out.println("ENTER TWO NO.");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("ENTER ooperator");
        String s1=sc.next();
        if(s1.equals("+"))
            System.out.println(a+b);
        else if(s1.equals("-"))
            System.out.println(a-b);
        else if(s1.equals("*"))
            System.out.println(a*b);
        else if(s1.equals("/"))
            System.out.println(a/b);

    }
}
