package Recursion_08;
import java.util.*;
public class pattern
{
    public static void main(String[] args)
    {
        Pattern1(0,0);

    }

    static void Pattern1(int r,int c)
    {
        if(r>5)
            return;
        if(r>=c)
        {
            System.out.print("*");
            Pattern1(r,c+1);
        }
        else
        {
            System.out.println();
            Pattern1(r+1,0);
        }

    }
}
