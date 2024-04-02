package Strings_06;

public class LargestOdd
{
    public static void main(String[] args)
    {
        String num="7542351161";
        long n=Integer.parseInt(num);
        if(n%2==1) System.out.println(num);
        int len=num.length();
        int c=0;
        for(long i=n;i>0;i/=10)
        {
            long k=i%10;
            c++;
            String str=num.substring(0,len-c);
            if(str.length()>0 && Integer.parseInt(str)%2==1)
                System.out.println(str);
        }
        System.out.println("NOPE");

    }
}





