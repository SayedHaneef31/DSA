package Recursion_08;

public class countZero_2
{
    public static void main(String[] args)
    {
        System.out.println(realCount(402033));

    }

    static int realCount(int n)
    {
        return helper(n,0);
    }

    static int helper(int n,int count)
    {
        if(n==0)
            return count;

        if(n%10==0)
            return helper(n/10,count+1);
        else
            return helper(n/10,count);

    }
}
