package First_JAVA_02;
//To find Armstrong Number between two given number.
//153
/*
1 ka cube 1
5 ka cube 125
3 ka cube 27
1+125+27=153
 */

import java.util.*;
public class NINETH
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE RANGE");
        int m = sc.nextInt();
        int n = sc.nextInt();
        for (int i = m; i < n; i++)
        {
            int sum=0;
            int a=i;
            int temp=0;
            while(a!=0)
            {
                temp=a%10;
                temp=(int)Math.pow(temp,3);
                sum=sum+temp;
                a/=10;
            }
            if(sum==i)
                System.out.print(sum+", ");

        }

    }
}
