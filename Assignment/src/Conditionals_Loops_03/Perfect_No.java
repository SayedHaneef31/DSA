package Conditionals_Loops_03;
//Perfect Number in between range In Java(Sum of all factors excluding itself)

import java.util.*;
public class Perfect_No
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range");
        int a = sc.nextInt();
        int b = sc.nextInt();
        for (int i = a; i < b; i++)
        {
            int sum=0;
            for (int j=1;j<i;j++)
            {
                if (i % j == 0) {
                    sum = sum + j;
                }
            }
            if (sum==i)
                System.out.print(i + ", ");
        }

    }
}
