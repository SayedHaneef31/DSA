package Functions_04;
import java.util.*;
public class AddIntegers
{
    public static void main(String[] args)
    {
            System.out.println(divide(2147483647,1));

    }
    public static int divide(int dividend, int divisor)
    {
        if(dividend==0) return 0;
        long absDividend=Math.abs((long)dividend);
        long absDivisor=Math.abs((long)divisor);
        if(absDivisor>absDividend) return 0;
        if(dividend==divisor) return 1;
        if(dividend<0 || divisor<0)
        {
            if(absDividend==absDivisor) return -1;
        }
        if(dividend>0 && divisor>0)
        {
            return ans(dividend,divisor);
        }
        if(dividend<0 && divisor<0)
        {
            return ans(absDividend,absDivisor);
        }
        int a=ans(absDividend,absDivisor);
        return -a;
    }
    static int ans(long dividend, long divisor)
    {
        int c=0;
        long sum=0;
        while(sum<dividend && (sum+divisor)<dividend)
        {
            sum=sum+divisor;
            c++;

        }
        return c;
    }
}


