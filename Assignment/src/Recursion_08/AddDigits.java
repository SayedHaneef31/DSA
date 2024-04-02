package Recursion_08;

public class AddDigits
{
    public static void main(String[] args) {
        System.out.println(addDigits(38));
    }
    public static int addDigits(int num)
    {
        return add(num);

    }
    static int add(int n)
    {
        if(n/10==0) return n;
        int sum=0;
        while(n>0)
        {
            sum=sum+n%10;
            n=n/10;
        }
        return sum;
    }

}



