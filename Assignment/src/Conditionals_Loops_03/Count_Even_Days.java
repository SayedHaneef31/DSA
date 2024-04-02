package Conditionals_Loops_03;
// Kunal is allowed to go out with his friends only on the even days of
// a given month. Write a program to count the number of
// days he can go out in the month inputed by the user.

import java.util.*;
public class Count_Even_Days
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
//        String s= new String(System.in);
        String s="";int i,days=0;
        System.out.println("Enter month name");
        s=sc.nextLine();
        s=s.toUpperCase();
        if (s.equals("JANUARY")||s.equals("MARCH")||s.equals("MAY")||s.equals("JULY")||s.equals("AUGUST")||s.equals("OCTOBER")||s.equals("DECEMBER"))
            days=31;
        if (s.equals("APRIL")||s.equals("JUNE")||s.equals("SEPTEMBER")||s.equals("NOVEMBER"))
            days=30;
        if (s.equals("FEBUARY"))
        {
            System.out.println("Which year?");
            int year=sc.nextInt();
            if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0))       //LEAP YEAR CONDITION
            days= 29;
            else
                days=28;
        }
        int count=0;
        for (i=1;i<=days;i++)
        {
            if (i%2==0)
                count++;

        }
        System.out.println("No. of days u can visit outside is "+count);
    }
}