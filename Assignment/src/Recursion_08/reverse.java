package Recursion_08;

public class reverse
{
    static int sum=0;
    public static void main(String[] args)
    {
        int n=123;
        rev(n);
        System.out.println(sum);
    }
    static void rev(int n)
    {
        if(n==0)
            return;
        int rem=n%10;
        sum=sum*10+rem;
        rev(n/10);

    }
}
