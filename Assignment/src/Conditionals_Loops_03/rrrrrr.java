package Conditionals_Loops_03;

public class rrrrrr
{
    public static void main(String[] args)
    {
        int x=153423;
        int k=964632435;

        long rev=0;
        long xx=x;
        while(xx>0)
        {
            if(((rev*10)+xx%10)> 2147483647)
            {
                System.out.println(0);
                System.exit(0);
            }
            rev=(rev*10)+xx%10;
            xx=xx/10;
        }
        System.out.println(rev);
    }

}
