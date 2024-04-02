package Recursion_08;
//                        *****
//                        ****
//                        ***
//                        **
//                        *
import java.util.Scanner;

public class RecPattern
{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        pattern(3,3);
    }

    static void pattern(int row,int col)
    {
        if(row<0)
        {
            return;
        }
        int c=col;
        while(c>0)
        {
            System.out.print("*");
            c--;
        }
        System.out.println();
        pattern(row-1,col);
    }
}
