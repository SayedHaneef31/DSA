package Recursion_08;

public class ggggg
{
    public static void main(String[] args)
    {
        int n=402033;
        int count=0;

        System.out.println(zeroes(n,count));
        System.out.println(count);


    }

    static int zeroes(int n,int count)
    {
        if(n==0)
            return count;

        if(n%10==0)
            return zeroes(n/10,count+1);
        else
            return zeroes(n/10,count);

    }
}

