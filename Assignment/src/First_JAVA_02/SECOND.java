package First_JAVA_02;
//Take name as input and print a greeting message for that particular name.

import java.util.*;
public class SECOND
{
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a name");
        String s=sc.nextLine();
        System.out.println("Hello there!");
        System.out.println("MASTER"+s);

    }
}
